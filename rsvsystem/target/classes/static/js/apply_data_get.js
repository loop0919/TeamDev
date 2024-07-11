//name_confirm
const name_v = sessionStorage.getItem("name_v"); //setから取得した値
const name_confirm = document.getElementById('name_confirm');
if(name_v == "a"){
    name_confirm.innerHTML = '<span>平野 柴耀</span>';
}else if(name_v == "b"){
    name_confirm.innerHTML = '<span>永瀬 廉</span>';
}else if(name_v == "c"){
    name_confirm.innerHTML = '<span>神宮寺 勇太</span>';
}else if(name_v == "d"){
    name_confirm.innerHTML = '<span>髙橋 海人</span>';
}else if(name_v == "e"){
    name_confirm.innerHTML = '<span>岸 優太</span>';
}

//date_confirm
const date_v = sessionStorage.getItem("date_v"); //setから取得した値
const date_confirm = document.getElementById('date_confirm');
date_confirm.innerHTML = '<span>' + date_v + '</span>';

//time_confirm
const time_v = sessionStorage.getItem("time_v"); //setから取得した値
const time_confirm = document.getElementById('time_confirm');
if(time_v == "1"){
    time_confirm.innerHTML = '<span>1コマ目 09:00 - 10:10</span>';
}else if(time_v == "2"){
    time_confirm.innerHTML = '<span>2コマ目 10:25 - 11:35</span>';
}else if(time_v == "3"){
    time_confirm.innerHTML = '<span>3コマ目 12:35 - 13:45</span>';
}else if(time_v == "4"){
    time_confirm.innerHTML = '<span>4コマ目 14:00 - 15:10</span>';
}else if(time_v == "5"){
    time_confirm.innerHTML = '<span>5コマ目 15:25 - 16:35</span>';
}else if(time_v == "6"){
    time_confirm.innerHTML = '<span>6コマ目 17:00 - 18:10</span>';
}else if(time_v == "7"){
    time_confirm.innerHTML = '<span>7コマ目 18:25 - 19:35</span>';
}

//classroom_confirm
const classroom_v = sessionStorage.getItem("classroom_v"); //setから取得した値
const classroom_confirm = document.getElementById('classroom_confirm');
classroom_confirm.innerHTML = '<span>' + classroom_v + '教室</span>';

//subject_confirm
const subject_v = sessionStorage.getItem("subject_v"); //setから取得した値
const subject_confirm = document.getElementById('subject_confirm');
if(subject_v == "japanese"){
    subject_confirm.innerHTML = '<span>国語</span>';
}else if(subject_v == "mathematics"){
    subject_confirm.innerHTML = '<span>算数</span>';
}else if(subject_v == "science"){
    subject_confirm.innerHTML = '<span>理科</span>';
}else if(subject_v == "society"){
    subject_confirm.innerHTML = '<span>社会</span>';
}else if(subject_v == "english"){
    subject_confirm.innerHTML = '<span>英語</span>';
}

//people_confirm
const people_v = sessionStorage.getItem("people_v"); //setから取得した値
const people_confirm = document.getElementById('people_confirm');
people_confirm.innerHTML = '<span>' + people_v + '</span>';

//comment_confirm
const comment_v = sessionStorage.getItem("comment_v"); //setから取得した値
const comment_confirm = document.getElementById('comment_confirm');
comment_confirm.innerHTML = '<span>' + comment_v + '</span>';

