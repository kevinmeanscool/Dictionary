
/* 搜索 */
var helangSearch={
    /* 元素集 */
    els:{},
    /* 搜索类型序号 */
    searchIndex:0,
    /* 火热的搜索列表 */
    hot:{
        /* 颜色 */
        color:['#ff2c00','#ff5a00','#ff8105','#fd9a15','#dfad1c','#6bc211','#3cc71e','#3cbe85','#51b2ef','#53b0ff'],
        /* 列表 */
        list:[
            /*待填充结果*/
        ]
    },
    /* 初始化 */
    init:function(){
        var _this=this;
        this.els={
            pickerBtn:$(".picker"),
            pickerList:$(".picker-list"),
            logo:$(".logo"),
            hotList:$(".hot-list"),
            input:$("#search-input"),
            button:$(".search")
        };


        /* 注册事件 */
        /* 搜索类别选择按钮 */
        this.els.pickerBtn.click(function () {
            if(_this.els.pickerList.is(':hidden')) {
                setTimeout(function () {
                    _this.els.pickerList.show();
                },100);
            }
        });
        /* 搜索类别选择列表 */
        this.els.pickerList.on("click",">li",function () {
            _this.searchIndex=$(this).index();
            _this.els.pickerBtn.html($(this).html())
        });
        /* 搜索 输入框 点击*/
        this.els.input.bind('input porpertychange',
            function () {
            var str = $(this).val();
            if($.trim(str)){
                setTimeout(function () {
                    console.log("aaa");
                    $.ajax({
                        url:"/entry/FuzzyMatchingResult",
                        method:"POST",
                        dataType:"json",
                        data:{"str":str,"category":$("#default_category").html()},
                        success:function(result){
                            //存入list
                            for(var i=0 ;  i<result.length ; i++ ){
                                _this.hot.list.push(result[i].entryname);
                            }
                            //转词条显示
                            _this.els.hotList.html(function () {
                                var str='';
                                $.each(_this.hot.list,function (index,item) {
                                    str+='<a href="https://www.baidu.com/s?ie=utf8&oe=utf8&tn=98010089_dg&ch=11&wd='+item+'" target="_blank">'
                                        +'<div class="number" style="color: '+_this.hot.color[index]+'">'+(index+1)+'</div>'
                                        +'<div>'+item+'</div>'
                                        +'</a>';
                                });
                                return str;
                            });
                            //显示完成后清空list
                            _this.hot.list.length = 0;
                        }
                    });
                    _this.els.hotList.show();
                },100);
            }
            else {
                setTimeout(function () {
                    _this.els.hotList.hide();
                },100);
            }

        });
        /* 搜索 输入框 输入*/
        this.els.input.on("input",function () {
            if($(this).val()){
                _this.els.hotList.hide();
            }
        });
        /* 搜索按钮 */
        this.els.button.click(function () {
            var searchArr=['百度','搜狗','必应','谷歌'];
            alert(searchArr[_this.searchIndex]+"搜索："+_this.els.input.val());
        });
        /* 文档 */
        $(document).click(function () {
            _this.els.pickerList.hide();
            _this.els.hotList.hide();
        });
        /* 搜索按钮 */
    }
};

