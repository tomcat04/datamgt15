/* 
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
Ext.onReady(function() {
    //border
    var viewport = Ext.create('Ext.container.Viewport', {
        title: '容器面板',
        renderTo: Ext.getBody(),
        width: 400,
        height: 300,
        layout: 'border',
        defaults: {
            split: true, //是否有分割线
            collapsible: true, //是否可以折叠
            bodyStyle: 'padding:15px'
        },
        items: [{
                region: 'north', //子元素的方位：north、west、east、center、south
                title: '北',
                xtype: "panel",
                html: "子元素1",
                height: 70
            }, {
                region: 'west',
                title: '西',
                xtype: "panel",
                html: "子元素2",
                width: 100

            }, 
//            {
//                region: 'east',
//                title: '东',
//                xtype: "panel",
//                html: "子元素2",
//                width: 100
//
//            }, 
            {
                region: 'center',
                title: '主体',
                xtype: "panel",
                html: "子元素3"
            }, 
            {
                region: 'south',
                title: '南',
                xtype: "panel",
                html: "子元素4",
                height: 70
            }]

    });
    viewport.show();
});