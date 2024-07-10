//値を渡す
document.getElementById('form').addEventListener('submit', function(event) {
    event.preventDefault();
    const name_v = document.getElementById("name").value;
    const date_v = document.getElementById("date").value;
    const time_v = document.getElementById("time").value;
    const classroom_v = document.getElementById("classroom").value;
    const subject_v = document.getElementById("subject").value;
    const people_v = document.getElementById("people").value;
    const comment_v = document.getElementById("comment").value;
    sessionStorage.setItem("name_v", name_v);
    sessionStorage.setItem("date_v", date_v);
    sessionStorage.setItem("time_v", time_v);
    sessionStorage.setItem("classroom_v", classroom_v);
    sessionStorage.setItem("subject_v", subject_v);
    sessionStorage.setItem("people_v", people_v);
    sessionStorage.setItem("comment_v", comment_v);
    window.location.href = './rsv_apply_confirm.html';
});