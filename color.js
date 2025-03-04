// Function to generate a random hex color
function getRandomColor() {
    const hexChars = "0123456789ABCDEF";
    let color = "#";
    for (let i = 0; i < 6; i++) {
        color += hexChars[Math.floor(Math.random() * 16)];
    }
    return color;
}

// Get elements
const flipButton = document.getElementById('flip-button');
const colorCode = document.getElementById('color-code');

// Add event listener to button
flipButton.addEventListener('click', () => {
    const newColor = getRandomColor();
    document.body.style.backgroundColor = newColor;
    colorCode.textContent = newColor;
});
