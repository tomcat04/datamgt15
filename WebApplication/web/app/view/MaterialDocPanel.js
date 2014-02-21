Ext.define("app.view.MaterialDocPanel", {
    extend: "Ext.panel.Panel",
    title: 'panel标题',
    draggable: false,
    border: false,
    layout: 'hbox',
    items: [
        Ext.create("Ext.panel.Panel", {
            flex: 0.3,
            border: false,
            items: [
                {
                    xtype: 'displayfield',
                    name: 'materialDesc',
                    value: '',
                    fieldLabel: '资料等级'
                },
                {
                    xtype: 'displayfield',
                    name: 'materialDesc',
                    value: '',
                    fieldLabel: 'BOM清单'
                },
                {
                    xtype: 'displayfield',
                    name: 'materialDesc',
                    value: '',
                    fieldLabel: '检验规范'
                },
                {
                    xtype: 'displayfield',
                    name: 'materialDesc',
                    value: '',
                    fieldLabel: '检验卡片'
                }

            ]
        }),
        Ext.create("Ext.panel.Panel", {
            border: false,
            flex: 0.3,
            items: [
                {
                    xtype: 'displayfield',
                    name: 'materialDesc',
                    value: '',
                    fieldLabel: '规格书'
                },
                {
                    xtype: 'displayfield',
                    name: 'materialDesc',
                    value: '',
                    fieldLabel: '质量协议签订'
                },
                {
                    xtype: 'displayfield',
                    name: 'materialDesc',
                    value: '',
                    fieldLabel: 'PPAP资料'
                }
            ]

        }),
        Ext.create("Ext.panel.Panel", {
            flex: 0.3,
            border: false,
            items: [
            ]
        })

    ]
});