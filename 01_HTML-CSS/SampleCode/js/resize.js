function init() {
    // リサイズ適用
    $("#targetImgDiv").resizable({});
 
    // 移動適用
    $("#targetImgDiv").draggable({});
}
 
window.onload = init();

function open(){
    window.open("H:\00_LANG_practice\01_HTML-CSS\SampleCode\NEKO.html","_blank");
}