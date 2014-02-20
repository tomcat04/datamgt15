

Ext.define("app.view.MainPageTabPanel", {
    extend: 'Ext.tab.Panel',
    alias:'widget.mainPageTabPanel',
    items: [
        {
            title: '首页',
            items: [
                Ext.create("Ext.panel.Panel", {
                    items: [Ext.create("app.view.MainPageGrid"),
                        Ext.create("app.view.MaterialDocPanel")
                    ]
                })
            ]
        }


    ]
});
