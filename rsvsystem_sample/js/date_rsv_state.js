let date = document.querySelector('.date_rsv_state');

date.addEventListener("change", () => {
	document.querySelector('.date_text').innerHTML = date.value;
});