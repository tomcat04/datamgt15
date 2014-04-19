

Ext.define('app.controller.TreeMenuController', {
    extend: 'Ext.app.Controller',
     views:[
      'TreeMenu'  
    ],
    stores:[
        'MenuStore'
    ],
    init: function() {
        this.control({
            'TreeMenu': {
                itemclick: function(view, record, item, index, e, eOpts) {
                    var tabs = Ext.getCmp('myMainPageTabPanel');
                    var myTabTitle = record.get('text');
                    var myMenuId = record.get("id");
                    var tab = tabs.query('[title=' + myTabTitle + ']');
                    if (tab.length === 0) {
                        if (myMenuId === "MaterialExceptionLog") {//TODO:菜单与tab对应方式优化
                            this.openTab(tabs, myTabTitle, "app.view.MaterialExceptionLogTabPanel");
                        } else if (myMenuId === 'MaterialExceptionReport') {
                            this.openTab(tabs, myTabTitle, "app.view.MaterialExceptionReportGrid");
                        }
                        
                    } else {
                        tabs.setActiveTab(tab[0]);
                    }

                }
            }
        });

    },
    openTab: function(parentTabs, title, viewName) {
        var newtab = parentTabs.add({
            title: title,
            closable: true,
            items: [
                Ext.create(viewName)
            ]
        });
        parentTabs.setActiveTab(newtab);
    }
   
});  