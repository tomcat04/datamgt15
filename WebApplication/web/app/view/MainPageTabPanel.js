

Ext.define("app.view.MainPageTabPanel", {
    extend: 'Ext.tab.Panel',
    alias: 'widget.mainPageTabPanel',
    layout:'fit',
    items: [
        {
            title: '物料信息首页', //TODO : use the menu text
            items: [
                Ext.create("Ext.panel.Panel", {
                    border: false,
                    items: [Ext.create("app.view.MainPageGrid"),
                        Ext.create("app.view.MaterialDocPanel")
                    ]
                })
            ]
        }
    ]
});
