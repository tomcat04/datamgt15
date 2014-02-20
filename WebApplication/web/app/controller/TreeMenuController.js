/* 
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */


Ext.define('app.controller.TreeMenuController', {
    extend: 'Ext.app.Controller',
    init: function() {
        this.control({
            'treeMenu': {
                itemclick: function(view, record, item, index, e, eOpts) {
                    var tabs = Ext.getCmp('myMainPageTabPanel');
                    var myTabTitle = record.get('text');
                    var myMenuId = record.get("id");
                    var tab = tabs.query('[title=' + myTabTitle + ']');
                    if (tab.length === 0) {
                        var a = Ext.create("app.view.MaterialExceptionLogTabPanel")
                        if (myMenuId === "MaterialExceptionLog") {//TODO:菜单与tab对应方式优化
                            var newtab = tabs.add({
                                title: myTabTitle,
                                closable: true,
                                items: [
                             a
                                ]
                            });
                            tabs.setActiveTab(newtab);
                        }

                    } else {
                        tabs.setActiveTab(tab[0]);
                    }

                }
            }
        });

    }
});  