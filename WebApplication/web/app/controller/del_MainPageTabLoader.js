/* 
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

/**
 * load the first tab 
 */

//Ext.define("app.controller.MainPageTabLoader", {
//    extend: 'Ext.app.Controller',
//    init: function() {
//        this.control({
//            'myviewport': {
//                afterlayout: function() {
//                    var tabs = Ext.getCmp('myMainPageTabPanel');
//                    var myTreeMenu = Ext.getCmp('myTreeMenu');
//                    var mainPageTab = tabs.add({
//                        title: '首页',
//                        items: [Ext.create("Ext.panel.Panel", {
//                                items: [Ext.create("app.view.MainPageGrid"),
//                                    Ext.create("app.view.MaterialDocPanel")
//                                ]
//                            })]
//                    });
//                    tabs.setActiveTab(mainPageTab);
//                }
//
//            }
//        });
//    }
//});