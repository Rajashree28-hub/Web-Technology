// Dynamic Project Data
const projects = [
    { title: "Project One", description: "A cool web app." },
    { title: "Project Two", description: "Another awesome project." },
    { title: "Project Three", description: "Yet another amazing creation." }
];

const projectList = document.getElementById('project-list');

projects.forEach(project => {
    const projectDiv = document.createElement('div');
    projectDiv.innerHTML = `
        <h3>${project.title}</h3>
        <p>${project.description}</p>
    `;
    projectList.appendChild(projectDiv);
});

// Form Validation
document.getElementById('contact-form').addEventListener('submit', function(e) {
    e.preventDefault();
    alert('Message sent successfully!');
    this.reset();
});
