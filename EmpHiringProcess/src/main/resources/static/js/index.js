$(document).ready(function () {
    const formSections = $(".form-section");
    let currentSectionIndex = 0;

    // Update the progress bar
    function updateProgressBar() {
        const progress = ((currentSectionIndex + 1) / formSections.length) * 100;
        $("#progressBar").css("width", progress + "%");
    }

    // Show the current section and hide others
    function showCurrentSection() {
        formSections.addClass("d-none");
        formSections.eq(currentSectionIndex).removeClass("d-none");
        updateProgressBar();
    }

    // Handle the "Next" button click
    $(".next-btn").click(function () {
        if (currentSectionIndex < formSections.length - 1) {
            currentSectionIndex++;
            showCurrentSection();
        }
    });

    // Handle the "Previous" button click
    $(".prev-btn").click(function () {
        if (currentSectionIndex > 0) {
            currentSectionIndex--;
            showCurrentSection();
        }
    });

    // Copy permanent address to current address if checkbox is checked
    $("#sameAsPermAddress").click(function () {
        if ($(this).is(":checked")) {
            $("#currentAddress").val($("#permanentAddress").val());
        } else {
            $("#currentAddress").val("");
        }
    });

    // Initial setup
    showCurrentSection();
});


