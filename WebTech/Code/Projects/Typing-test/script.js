// script.js
const textDisplay = document.getElementById("textDisplay");
const timerElement = document.getElementById("timer");
const wpmElement = document.getElementById("wpm");
const accuracyElement = document.getElementById("accuracy");
const resultBox = document.querySelector(".result");

const texts = [
  "Java is a high-level, object-oriented programming language.",
  "Practice makes perfect, especially when learning to type.",
  "Always focus on accuracy before speed in typing tests."
];

let currentText = "";
let startTime, timerInterval;
let typedCorrect = 0;
let currentIndex = 0;

function toggleProfilePopup() {
  const popup = document.getElementById("profilePopup");
  popup.style.display = popup.style.display === 'flex' ? 'none' : 'flex';
}

function startTest() {
  currentText = texts[Math.floor(Math.random() * texts.length)];
  textDisplay.innerHTML = currentText
    .split("")
    .map((char, i) => `<span>${char}</span>`)
    .join("");

  startTime = null;
  currentIndex = 0;
  typedCorrect = 0;
  clearInterval(timerInterval);
  timerElement.textContent = "0";
  wpmElement.textContent = "0";
  accuracyElement.textContent = "100";
  resultBox.style.display = "none";

  document.addEventListener("keydown", handleKey);
  updateActiveChar();
}

function handleKey(e) {
  const spans = textDisplay.querySelectorAll("span");
  const key = e.key;

  if (!startTime) {
    startTime = Date.now();
    timerInterval = setInterval(updateTimer, 1000);
  }

  if (key.length === 1 || key === ' ') {
    const expected = spans[currentIndex].textContent;
    spans[currentIndex].classList.remove("active");

    if (key === expected) {
      spans[currentIndex].classList.add("correct");
      typedCorrect++;
    } else {
      spans[currentIndex].classList.add("incorrect");
    }

    currentIndex++;
    updateActiveChar();

    if (currentIndex === spans.length) {
      clearInterval(timerInterval);
      document.removeEventListener("keydown", handleKey);
      showResults();
    }
  }
}

function updateActiveChar() {
  const spans = textDisplay.querySelectorAll("span");
  spans.forEach(s => s.classList.remove("active"));
  if (spans[currentIndex]) {
    spans[currentIndex].classList.add("active");
  }
}

function updateTimer() {
  const elapsed = Math.floor((Date.now() - startTime) / 1000);
  timerElement.textContent = elapsed;
  updateStats(elapsed);
}

function updateStats(elapsedSeconds) {
  const wpm = Math.round(((typedCorrect / 5) / elapsedSeconds) * 60);
  const accuracy = Math.round((typedCorrect / currentIndex) * 100);
  wpmElement.textContent = isFinite(wpm) ? wpm : 0;
  accuracyElement.textContent = isFinite(accuracy) ? accuracy : 0;
}

function showResults() {
  const time = Math.max(1, Math.floor((Date.now() - startTime) / 1000));
  const wpm = Math.round(((typedCorrect / 5) / time) * 60);
  const accuracy = Math.round((typedCorrect / currentIndex) * 100);

  resultBox.style.display = "flex";
  const ctx = document.getElementById('resultChart').getContext('2d');
  new Chart(ctx, {
    type: 'doughnut',
    data: {
      labels: ['Accuracy', 'Mistakes'],
      datasets: [{
        data: [accuracy, 100 - accuracy],
        backgroundColor: ['#a3e635', '#f87171'],
        borderWidth: 0
      }]
    },
    options: {
      cutout: '70%',
      plugins: {
        legend: { display: true },
        tooltip: { enabled: true }
      }
    }
  });
}

startTest();
