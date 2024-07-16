const classroom = document.getElementById("classroom");
const room101 = document.getElementById("v_101");
const room102 = document.getElementById("v_102");
const room103 = document.getElementById("v_103");
const room104 = document.getElementById("v_104");
const room201 = document.getElementById("v_201");
const room202 = document.getElementById("v_202");
const room301 = document.getElementById("v_301");
const room302 = document.getElementById("v_302");
const room303 = document.getElementById("v_303");

classroom.addEventListener("change", (event) => {
    const value = event.target.value;
    room101.classList.toggle("hidden", value !== "101");
    room102.classList.toggle("hidden", value !== "102");
    room103.classList.toggle("hidden", value !== "103");
    room104.classList.toggle("hidden", value !== "104");
    room201.classList.toggle("hidden", value !== "201");
    room202.classList.toggle("hidden", value !== "202");
    room301.classList.toggle("hidden", value !== "301");
    room302.classList.toggle("hidden", value !== "302");
    room303.classList.toggle("hidden", value !== "303");
});

