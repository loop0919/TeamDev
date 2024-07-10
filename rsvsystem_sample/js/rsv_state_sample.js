//日付が20240801のとき、id=0801表示
//日付が20240802のとき、id=0802表示
//予約済は「rsv_科目名」
const date = document.getElementById("date");   //「日付」のvalue取得
if(date == "2024-08-01"){
    state1_104.classList.add("rsv_japanese");   //クラス名追加
    let reserver_sub = "<p>○○ ○○<br>国語</p>";
    state1_104.innerHTML += reserver_sub;

}else if(date == "2024-08-02"){

}