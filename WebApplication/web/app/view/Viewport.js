    //border
    Ext.define('app.view.Viewport', {
        extend:'Ext.container.Viewport',
        requires:[
            "app.view.TreeMenu"
        ],
        title: '容器面板',
//        renderTo: Ext.getBody(),
        width: 400,
        height: 300,
        layout: 'border',
        defaults: {
            split: true, //是否有分割线
            collapsible: true, //是否可以折叠
            bodyStyle: 'padding:0px'
        },
        items: [{
                region: 'north', //子元素的方位：north、west、east、center、south
                title: '北',
                xtype: "panel",
                html: "子元素1",
                height: 70
            }, {
                region: 'west',
                title: '导航栏',
//                xtype: "treepanel",
                items:[Ext.create("app.view.TreeMenu")],
                width: 250,
                layout:'fit'
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
                items:[Ext.create("app.view.MainPageGrid"),Ext.create("app.view.MaterialDocPanel")]
            }
            , {
                region: 'south',
                title: '南',
                xtype: "panel"
        
            }
        ],
        initComponent : function(){
                this.callParent(arguments);
        }
    });