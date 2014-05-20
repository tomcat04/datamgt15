/* 
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

Ext.define("app.view.MaterialExceptionLogTabPanel", {
    extend: "Ext.container.Container",
    alias: "widget.MaterialExceptionLogTabPanel",
//    items: [ //do NOT using this atrribute when extend the panel ,it sucks
//        
////                
//            ]
//        })
//    ],
    constructor: function(config) {
        this.callParent(arguments); 
//        this.insert(
//                Ext.create("Ext.panel.Panel", {
//                    items: [
//                        Ext.create("Ext.form.Panel", {
//                            autoHeight: true,
//                            bodyPadding: 10,
//                            defaults: {
//                                anchor: '100%',
//                                labelWidth: 100
//                            },
//                            items: [
//                                {
//                                    xtype: 'container',
//                                    layout: 'hbox',
//                                    border: false,
//                                    items: [{
//                                            xtype: 'container',
//                                            layout: 'vbox',
//                                            border: false,
//                                            flex: 0.25,
//                                            items: [
//                                                {
//                                                    xtype: 'textfield',
//                                                    name: 'materialCode',
//                                                    fieldLabel: '物料编码',
//                                                    msgTarget: 'side',
//                                                    allowBlank: false
//                                                },
//                                                {
//                                                    xtype: 'displayfield',
//                                                    name: 'materialDesc',
//                                                    fieldLabel: '物料描述'
//                                                }
//                                            ]
//                                        },
//                                        {
//                                            xtype: 'container',
//                                            border: false,
//                                            layout: 'vbox',
//                                            flex: 0.25,
//                                            items: [
//                                                {
//                                                    xtype: 'textfield',
//                                                    name: 'materialDesc',
//                                                    fieldLabel: '供应商',
//                                                    msgTarget: 'side',
//                                                    allowBlank: false
//                                                },
//                                                {
//                                                    xtype: 'displayfield',
//                                                    name: 'materialDesc',
//                                                    value: '',
//                                                    fieldLabel: '原厂描述'
//
//                                                }
//                                            ]
//                                        },
//                                        {
//                                            xtype: 'panel',
//                                            border: false,
//                                            layout: 'vbox',
//                                            flex: 0.25,
//                                            items: [
//                                                {
//                                                    xtype: 'button',
//                                                    text: '搜索',
//                                                    height: 25,
//                                                    width: 60
//
//                                                },
//                                                {
//                                                    xtype: 'displayfield',
//                                                    name: 'materialDesc',
//                                                    value: '',
//                                                    fieldLabel: '品牌'
//                                                }
//                                            ]
//                                        }, {
//                                            xtype: 'panel',
//                                            border: false,
//                                            layout: 'vbox',
//                                            flex: 0.25,
//                                            items: [
//                                                {
//                                                    xtype: 'displayfield'
//                                                            //for space
//
//                                                },
//                                                {
//                                                    xtype: 'displayfield',
//                                                    name: 'materialDesc',
//                                                    value: '',
//                                                    fieldLabel: '适用项目'
//                                                }
//                                            ]
//                                        }]
//                                }
//                            ]
//                        })
//                    ]
//                })
//                );
        this.insert(Ext.create("app.view.MaterialExceptionLogGrid"));
        
    }
});
