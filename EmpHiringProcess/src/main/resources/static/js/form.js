document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('interviewForm');
    const sections = document.querySelectorAll('.form-section');
    const nextBtns = document.querySelectorAll('.next-btn');
    const prevBtns = document.querySelectorAll('.prev-btn');
    const progressBar = document.getElementById('progressBar');
    let currentSection = 0;

    // Function to show the current section and hide others
    function showSection(index) {
        sections.forEach((section, i) => {
            section.classList.toggle('d-none', i !== index);
        });
        currentSection = index;
        updateProgressBar();
    }

    // Function to update the progress bar
    function updateProgressBar() {
        const progress = ((currentSection + 1) / sections.length) * 100;
        progressBar.style.width = `${progress}%`;
    }

    // Function to show error messages
    function showError(element, message) {
        const error = document.createElement('div');
        error.className = 'error';
        error.textContent = message;
        element.parentNode.insertBefore(error, element.nextSibling);
        element.classList.add('is-invalid');
    }

    // Function to clear error messages
    function clearErrors() {
        const errors = document.querySelectorAll('.error');
        errors.forEach(error => error.remove());
        const invalidFields = document.querySelectorAll('.is-invalid');
        invalidFields.forEach(field => field.classList.remove('is-invalid'));
    }

    // Function to validate email
    function validateEmail(email) {
        const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return re.test(String(email).toLowerCase());
    }

    // Function to validate phone number
    function validatePhoneNumber(phone) {
        return phone.trim().length >= 10;
    }

    // Function to validate section
    function validateSection(index) {
        let isValid = true;
        const inputs = sections[index].querySelectorAll('input, select, textarea');
        clearErrors();

        inputs.forEach(input => {
            if (input.required && !input.value.trim()) {
                showError(input, `${input.previousElementSibling.textContent} is required.`);
                isValid = false;
            } else if (input.type === 'email' && !validateEmail(input.value.trim())) {
                showError(input, 'Please enter a valid email address.');
                isValid = false;
            } else if (input.type === 'tel' && !validatePhoneNumber(input.value.trim())) {
                showError(input, 'Phone number must be at least 10 digits long.');
                isValid = false;
            } else {
                input.classList.remove('is-invalid');
            }
        });

        // Special validation cases
        if (index === 1) { // Education Details
            const gradInstitution = document.querySelector('input[name="eduGradInstitution"]').value.trim();
            const gradYear = document.querySelector('input[name="eduGradYear"]').value.trim();
            const gradMarks = document.querySelector('input[name="eduGradMarks"]').value.trim();
            if (!gradInstitution || !gradYear || !gradMarks) {
                alert('Graduation details are required.');
                isValid = false;
            }
        }

        if (index === 5) { // References
            const ref1Inputs = document.querySelectorAll('#ref1Name, #ref1Designation, #ref1Company, #ref1Address, #ref1Contact, #ref1Notes');
            const ref2Inputs = document.querySelectorAll('#ref2Name, #ref2Designation, #ref2Company, #ref2Address, #ref2Contact, #ref2Notes');
            if (ref1Inputs[0].value || ref1Inputs[1].value || ref1Inputs[2].value || ref1Inputs[3].value || ref1Inputs[4].value || ref1Inputs[5].value) {
                ref1Inputs.forEach(input => {
                    if (!input.value.trim()) {
                        input.classList.add('is-invalid');
                        isValid = false;
                    }
                });
            }
            if (ref2Inputs[0].value || ref2Inputs[1].value || ref2Inputs[2].value || ref2Inputs[3].value || ref2Inputs[4].value || ref2Inputs[5].value) {
                ref2Inputs.forEach(input => {
                    if (!input.value.trim()) {
                        input.classList.add('is-invalid');
                        isValid = false;
                    }
                });
            }
        }

        if (index === sections.length - 1) { // Document Upload Section
            const fileInputs = sections[index].querySelectorAll('input[type="file"]');
            if (fileInputs.length > 0) {
                let filesUploaded = false;
                fileInputs.forEach(input => {
                    if (input.files.length > 0) {
                        filesUploaded = true;
                    }
                });
                if (!filesUploaded) {
                    alert('Please upload at least one document.');
                    isValid = false;
                }
            }
        }

        return isValid;
    }

    // Move to the next section
    nextBtns.forEach(btn => {
        btn.addEventListener('click', function() {
            if (validateSection(currentSection)) {
                showSection(currentSection + 1);
            }
        });
    });

    // Move to the previous section
    prevBtns.forEach(btn => {
        btn.addEventListener('click', function() {
            showSection(currentSection - 1);
        });
    });

    // Form submit event
   
    // Handle the same address checkbox
    const sameAsPermAddress = document.getElementById('sameAsPermAddress');
    sameAsPermAddress.addEventListener('change', function() {
        if (this.checked) {
            document.getElementById('currentAddress').value = document.getElementById('permanentAddress').value;
        }
    });

    // Function to handle the removal of work experience entries
    function handleRemoveButtonClick(event) {
        const button = event.target;
        const workExperienceEntry = button.closest('tr');
        if (workExperienceEntry) {
            workExperienceEntry.remove();
        }
    }

    // Attach event listeners to all existing remove buttons
    const removeButtons = document.querySelectorAll('.remove-btn');
    removeButtons.forEach(button => {
        button.addEventListener('click', handleRemoveButtonClick);
    });

    // Function to add new work experience entry
    function addWorkExperienceEntry() {
        const workExperienceTable = document.getElementById('workExperienceTable').querySelector('tbody');
        const newRow = document.createElement('tr');
        newRow.innerHTML = `
            <td><input type="text" class="form-control" name="company"></td>
            <td><input type="text" class="form-control" name="designation"></td>
            <td><input type="month" class="form-control" name="fromDate"></td>
            <td><input type="month" class="form-control" name="toDate"></td>
            <td><input type="text" class="form-control" name="experience"></td>
            <td class="text-center"><button type="button" class="btn btn-danger remove-btn">Remove</button></td>
        `;
        workExperienceTable.appendChild(newRow);

        // Attach the event listener to the new remove button
        const newRemoveButton = newRow.querySelector('.remove-btn');
        newRemoveButton.addEventListener('click', handleRemoveButtonClick);
    }

    // Attach event listener to the add work experience button
    const addWorkExperienceButton = document.getElementById('addWorkExperience');
    if (addWorkExperienceButton) {
        addWorkExperienceButton.addEventListener('click', addWorkExperienceEntry);
    }

    // Initialize the form by showing the first section
    showSection(currentSection);
});




