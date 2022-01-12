'use strict';
$(function() {
   $(document).on('click', "[id^=like]", function (e) {
   //aタグでの遷移をキャンセル
   e.preventDefault();
   //index番号の取得
   const id = $(this).attr('id').replace("like", "");
    $.ajax({
        url: 'http://localhost:8080/like/item',
        dataType: 'text',
        data: { 
          stockId: $("#stockId" + id).val()
        },
		type: 'post',
        async: true
    }).done(function() {
      //ボタンの色を変更
		 $("#like" + id).css('color', 'red');
		 alert('お気に入りに追加しました');
    }).fail(function(XMLHttpRequest, textStatus, errorThrown) {
      // 失敗時には、その旨をダイアログ表示
      alert('ログイン後、使用可能になります');
      console.log('XMLHttpRequest : ' + XMLHttpRequest.status);
      console.log('textStatus     : ' + textStatus);
      console.log('errorThrown    : ' + errorThrown.message);
    });
  });
});