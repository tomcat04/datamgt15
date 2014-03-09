var required = '<span style="color:red;font-weight:bold" data-qtip="Required">*</span>';

Ext.define("app.view.MaterialFullInfoAddWindow", {
    extend: "Ext.window.Window",
    title: 'Multi Column, Nested Layouts and Anchoring',
    width: 600,
    closeAction: 'hide',
    items: [
        Ext.create("Ext.form.Panel", {
            fieldDefaults: {
                labelAlign: 'top',
                msgTarget: 'side'
            },
            bodyPadding: '5 5 0',
            items: [{
                    xtype: 'container',
                    anchor: '100%',
                    layout: 'hbox',
                    items: [{
                            xtype: 'container',
                            flex: 1,
                            layout: 'anchor',
                            items: [{
                                    xtype: 'textfield',
                                    fieldLabel: '编号',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    anchor: '95%'
                                }, {
                                    xtype: 'textfield',
                                    fieldLabel: '物料编码',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    anchor: '95%'
                                }, {
                                    xtype: 'textfield',
                                    fieldLabel: '物料描述',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    anchor: '95%'
                                }, {
                                    xtype: 'textfield',
                                    fieldLabel: '原厂描述',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    anchor: '95%'
                                }, {
                                    xtype: 'textfield',
                                    fieldLabel: '提交等级',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    anchor: '95%'
                                }, {
                                    xtype: 'textfield',
                                    fieldLabel: '是否添加资料',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    anchor: '95%'
                                }, {
                                    xtype: 'textfield',
                                    fieldLabel: '质量管理体系',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    anchor: '95%'
                                }, {
                                    xtype: 'textfield',
                                    fieldLabel: '供应商',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    anchor: '95%'
                                }, {
                                    xtype: 'textfield',
                                    fieldLabel: '品牌',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    anchor: '95%'
                                }, {
                                    xtype: 'filefield',
                                    fieldLabel: 'BOM清单',
                                    labelAlign: 'left',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    buttonText: '',
                                    buttonConfig: {
                                        iconCls: 'upload-icon'
                                    },
                                    anchor: '95%'

                                }, {
                                    xtype: 'filefield',
                                    fieldLabel: '实物图片',
                                    labelAlign: 'left',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    buttonText: '',
                                    buttonConfig: {
                                        iconCls: 'upload-icon'
                                    },
                                    anchor: '95%'
                                }, {
                                    xtype: 'filefield',
                                    fieldLabel: '检验规范',
                                    labelAlign: 'left',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    buttonText: '',
                                    buttonConfig: {
                                        iconCls: 'upload-icon'
                                    },
                                    anchor: '95%'
                                }, {
                                    xtype: 'filefield',
                                    fieldLabel: '检验卡片',
                                    labelAlign: 'left',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    buttonText: '',
                                    buttonConfig: {
                                        iconCls: 'upload-icon'
                                    },
                                    anchor: '95%'
                                }, {
                                    xtype: 'filefield',
                                    fieldLabel: '规格书',
                                    labelAlign: 'left',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    buttonText: '',
                                    buttonConfig: {
                                        iconCls: 'upload-icon'
                                    },
                                    anchor: '95%'
                                }, {
                                    xtype: 'filefield',
                                    fieldLabel: '质量协议签订',
                                    labelAlign: 'left',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    buttonText: '',
                                    buttonConfig: {
                                        iconCls: 'upload-icon'
                                    },
                                    anchor: '95%'
                                }, {
                                    xtype: 'filefield',
                                    fieldLabel: 'PPAP资料',
                                    labelAlign: 'left',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    buttonText: '',
                                    buttonConfig: {
                                        iconCls: 'upload-icon'
                                    },
                                    anchor: '95%'
                                }]
                        }, {
                            xtype: 'container',
                            flex: 1,
                            layout: 'anchor',
                            items: [{
                                    xtype: 'textfield',
                                    fieldLabel: '供应商等级',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    anchor: '95%'
                                }, {
                                    xtype: 'textfield',
                                    fieldLabel: '供应产联系方式',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    anchor: '95%'
                                }, {
                                    xtype: 'textfield',
                                    fieldLabel: '联系人',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    anchor: '95%'
                                }, {
                                    xtype: 'textfield',
                                    fieldLabel: '座机',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    anchor: '95%'
                                }, {
                                    xtype: 'textfield',
                                    fieldLabel: 'E-mail',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    anchor: '95%'
                                }, {
                                    xtype: 'textfield',
                                    fieldLabel: '手机',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    anchor: '95%'
                                }, {
                                    xtype: 'textfield',
                                    fieldLabel: '交货周期',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    anchor: '95%'
                                }, {
                                    xtype: 'textfield',
                                    fieldLabel: '供货状态',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    anchor: '95%'
                                }, {
                                    xtype: 'textareafield',
                                    fieldLabel: '备注',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                    name: 'first',
                                    anchor: '95%'
                                }
                            ]
                        }]
                }],
            buttons: [{
                    text: 'Save',
                    handler: function() {
                        this.up('form').getForm().isValid();
                    }
                }, {
                    text: 'Cancel',
                    handler: function() {
                        this.up('form').getForm().reset();
                    }
                }]
        })
    ]
});

