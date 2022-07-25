const container = document.querySelector('.container');
const card = document.querySelector('.card');
const { width, height } = container.getBoundingClientRect();

container.addEventListener('mousemove', (event) => {
    const { offsetX, offsetY} = event;

    card.style.setProperty('--x-pos', (offsetX / width) - 0.5);
    card.style.setProperty('--y-pos', (offsetY / height) - 0.5);
});