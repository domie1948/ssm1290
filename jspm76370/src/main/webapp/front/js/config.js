
var projectName = '学校运动会信息管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.jsp'
},

]


var indexNav = [

{
	name: '比赛信息',
	url: './pages/bisaixinxi/list.jsp'
}, 
{
	name: '公告信息',
	url: './pages/gonggaoxinxi/list.jsp'
}, 

{
	name: '论坛信息',
	url: './pages/forum/list.jsp'
}, 
{
	name: '新闻资讯',
	url: './pages/news/list.jsp'
},
{
	name: '留言反馈',
	url: './pages/messages/list.jsp'
}
]

var adminurl =  "http://localhost:8080/jspm76370/index.jsp";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"裁判","menuJump":"列表","tableName":"caipan"}],"menu":"裁判管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"比赛项目","menuJump":"列表","tableName":"bisaixiangmu"}],"menu":"比赛项目管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"比赛信息","menuJump":"列表","tableName":"bisaixinxi"}],"menu":"比赛信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"公告信息","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论","审核"],"menu":"赛事报名","menuJump":"列表","tableName":"saishibaoming"}],"menu":"赛事报名管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"比赛成绩","menuJump":"列表","tableName":"bisaichengji"}],"menu":"比赛成绩管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"犯规记录","menuJump":"列表","tableName":"fanguijilu"}],"menu":"犯规记录管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"论坛管理","tableName":"forum"}],"menu":"论坛管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"新闻资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","报名"],"menu":"比赛信息列表","menuJump":"列表","tableName":"bisaixinxi"}],"menu":"比赛信息模块"},{"child":[{"buttons":["查看"],"menu":"公告信息列表","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查询成绩"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["查看","删除"],"menu":"赛事报名","menuJump":"列表","tableName":"saishibaoming"}],"menu":"赛事报名管理"},{"child":[{"buttons":["查看"],"menu":"比赛成绩","menuJump":"列表","tableName":"bisaichengji"}],"menu":"比赛成绩管理"}],"frontMenu":[{"child":[{"buttons":["查看","报名"],"menu":"比赛信息列表","menuJump":"列表","tableName":"bisaixinxi"}],"menu":"比赛信息模块"},{"child":[{"buttons":["查看"],"menu":"公告信息列表","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["查看","发布成绩"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"比赛项目","menuJump":"列表","tableName":"bisaixiangmu"}],"menu":"比赛项目管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"比赛信息","menuJump":"列表","tableName":"bisaixinxi"}],"menu":"比赛信息管理"},{"child":[{"buttons":["修改","新增","查看"],"menu":"公告信息","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息管理"},{"child":[{"buttons":["查看","查看评论","删除","审核"],"menu":"赛事报名","menuJump":"列表","tableName":"saishibaoming"}],"menu":"赛事报名管理"},{"child":[{"buttons":["查看","修改","删除","新增"],"menu":"比赛成绩","menuJump":"列表","tableName":"bisaichengji"}],"menu":"比赛成绩管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"犯规记录","menuJump":"列表","tableName":"fanguijilu"}],"menu":"犯规记录管理"}],"frontMenu":[{"child":[{"buttons":["查看","报名"],"menu":"比赛信息列表","menuJump":"列表","tableName":"bisaixinxi"}],"menu":"比赛信息模块"},{"child":[{"buttons":["查看"],"menu":"公告信息列表","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"是","roleName":"裁判","tableName":"caipan"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
