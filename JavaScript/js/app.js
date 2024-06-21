$(() => {
    // ボタン (id="btn") がクリックされたときの処理
    $('#btn').on('click', () => {
        // 入力された郵便番号でWebAPI に住所情報をリクエスト
        $.ajax({
            // 住所取得をするAPIを叩く
            url: `http://zipcloud.ibsnet.co.jp/api/search?zipcode=${$('#zipcode').val()}`,
            dataType: 'jsonp',
        }).done(data => {
            // APIデータ取得後の処理
            if (data.results) {
                setData(data.results[0]);
            } else {
                alert('該当するデータが見つかりませんでした');
            }
        }).fail(data => {
            // APIデータの取得に失敗した場合
            alert('通信に失敗しました');
        });
    });
});

const setData = data => {
    $('#prefecture').val(data.address1); // 都道府県名
    $('#city').val(data.address2); // 市町村名
    $('#address').val(data.address3); // 町域名
};
