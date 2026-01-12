<template>
  <div class="app-container home">
    <el-row :gutter="20">
      <el-col :sm="24" :lg="12" style="padding-left: 20px">
        <h2>有机蔬菜订购</h2>
        <h3>
          有机生活，从一口鲜蔬开始
        </h3>
        <p>
          我们深耕有机种植十年
          严格遵循「自然农法」
          土壤检测、有机认证、全程溯源
          每一份蔬菜，都经过农科专家把关
          登录平台，选当季有机鲜蔬
          给家人最安心的营养守护
          <br>
          在钢筋水泥的城市森林里，我们为您辟出一片「有机鲜境」。
          这里的蔬菜，长在晨露浸润的沃土，晒足日光，喝饱雨水，遵循四季的节奏自然生长。
          不施化肥、不打农药，用最本真的姿态，奔赴您的厨房。
          从有机农场到您家餐桌，冷链直达锁住每一份鲜爽。
          无论是给孩子做辅食的细腻青菜，为家人加餐的饱满茄果，还是想犒劳自己的脆嫩瓜蔬，都能在这里找到。
          点击开启，把田间的清新与健康，端上您的日常三餐 ——
        </p>
        <p>
          <el-tag type="danger">免费品尝</el-tag>
        </p>
        <p>
          <el-button
            type="primary"
            size="mini"
            icon="el-icon-cloudy"
            plain
            @click="goTarget('https://www.cnca.gov.cn/hlwfw/ywzl/spncprz/index.html')"
            >查询认证</el-button
          >
          <el-button
            size="mini"
            icon="el-icon-s-home"
            plain
            @click="goTarget('http://ruoyi.vip')"
            >访问主页</el-button
          >
        </p>
      </el-col>

      <el-col :sm="24" :lg="12" style="padding-left: 50px">
        <el-row>
          <el-col :span="12">
            <h2>有机蔬菜应用技术</h2>
          </el-col>
        </el-row>
        <el-row>
          <el-col :span="6">
            <h4>生产技术</h4>
            <ul>
              <li>品种选择技术</li>
              <li>育苗技术</li>
              <li>有机无土栽培育苗
              </li>
              <li>栽培管理技术</li>
              <li>病虫害绿色防控技术</li>
              <li>标准化栽培技术规程</li>
              <li>...</li>
            </ul>
          </el-col>
          <el-col :span="6">
            <h4>保鲜运输技术</h4>
            <ul>
              <li>采后预处理技术</li>
              <li>分拣与包装技术</li>
              <li>温控运输技术</li>
              <li>保鲜箱与循环系统技术</li>
              <li>生物冰袋 / 冰盒应用</li>
              <li>环保与可追溯包装</li>
              <li>...</li>
            </ul>
          </el-col>
        </el-row>
      </el-col>
    </el-row>
    <el-divider />
    <el-row :gutter="20">
      <el-col :xs="24" :sm="24" :md="12" :lg="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span>联系信息</span>
          </div>
          <div class="body">
            <p>
              <i class="el-icon-s-promotion"></i> 官网：<el-link
                href="http://www.greenfood.agri.cn/xxcx/"
                target="_blank"
                >http://http://www.greenfood.agri.cn/xxcx/</el-link
              >
            </p>
            <p>
              <i class="el-icon-user-solid"></i> 邮箱 ：moyan548@foxmail.com
             <a href="http://qm.qq.com/cgi-bin/qm/qr?_wv=1027&k=G6r5KGCaa3pqdbUSXNIgYloyb8e0_L0D&authKey=4w8tF1eGW7%2FedWn%2FHAypQksdrML%2BDHolQSx7094Agm7Luakj9EbfPnSTxSi2T1LQ&noverify=0&group_code=228578329" target="_blank">228578329</a>
            </p>
            <p>
              <i class="el-icon-chat-dot-round"></i> 微信：<a
                href="javascript:;"
                >Seren</a
              >
            </p>
            <p>
              <i class="el-icon-money"></i> 支付宝：<a
                href="javascript:;"
                class="支付宝信息"
                >言</a
              >
            </p>
          </div>
        </el-card>
      </el-col>
      <el-col :xs="24" :sm="24" :md="12" :lg="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span>更新有机蔬菜认证</span>
          </div>
          <el-collapse accordion>
            <el-collapse-item title="v3.9.0 - 2025-05-28">
              <ol>
                <li>优化菜单搜索查询页</li>
                <li>导航栏显示昵称&设置</li>
                <li>菜单管理新增路由名称</li>
                <li>添加底部版权信息&开关</li>
                <li>分配角色禁用不允许勾选</li>
                <li>Excel导入导出支持多图片</li>
                <li>添加页签图标显示开关功能</li>
                <li>上传组件新增拖动排序属性</li>
                <li>显隐列组件支持全选/全不选</li>
                <li>初始密码支持自定义修改策略</li>
                <li>账号密码支持自定义更新周期</li>
                <li>代码生成列表支持按时间排序</li>
                <li>支持富文本复制粘贴图片上传至url</li>
                <li>支持文件&图片组件自定义地址&参数</li>
                <li>升级tomcat到最新版本9.0.105</li>
                <li>升级oshi到最新版本6.8.1</li>
                <li>升级fastjson到最新版2.0.57</li>
                <li>升级commons.io到最新版本2.19.0</li>
                <li>package.json移除runjs依赖</li>
                <li>package.json移除eslint依赖</li>
                <li>package.json移除vue-meta依赖</li>
                <li>修复代码生成主子表校验必填失效问题</li>
                <li>优化前端树结构性能问题</li>
                <li>优化前端处理路由函数代码</li>
                <li>优化文件上传组件新增类型</li>
                <li>优化顶部菜单搜索栏为多层级显示</li>
                <li>优化文件&图片上传组件新增disabled属性</li>
                <li>优化空指针异常时无法获取错误信息问题</li>
                <li>优化定时任务字符包含多个括号导致数据错误</li>
                <li>优化登录&注册页表头使用VUE_APP_TITLE配置值</li>
                <li>优化导出Excel日期格式双击离开后与设定的格式不一致问题</li>
                <li>其他细节优化</li>
              </ol>
            </el-collapse-item>
            <el-collapse-item title="v3.8.9 - 2024-12-30">
              <ol>
                <li>用户管理支持分栏拖动</li>
                <li>修改主题样式本地读取</li>
                <li>用户头像http(s)链接支持</li>
                <li>用户管理过滤掉已禁用部门</li>
                <li>支持自定义显示Excel属性列</li>
                <li>操作日志记录DELETE请求参数</li>
                <li>白名单支持对通配符路径匹配</li>
                <li>校检文件名是否包含特殊字符</li>
                <li>代码生成创建表屏蔽违规的字符</li>
                <li>菜单面包屑导航支持多层级显示</li>
                <li>Excel注解支持wrapText是否允许内容换行</li>
                <li>代码生成新增配置是否允许文件覆盖到本地</li>
                <li>修复角色禁用权限不失效问题</li>
                <li>修复代码生成上级菜单显示问题</li>
                <li>修复导出子列表对象只能在最后的问题</li>
                <li>修复TopNav无法正确获取active的问题</li>
                <li>修复默认关闭Tags-Views内链页面打不开</li>
                <li>升级oshi到最新版本6.6.5</li>
                <li>升级tomcat到最新版本9.0.96</li>
                <li>升级fastjson到最新版2.0.53</li>
                <li>升级logback到最新版本1.2.13</li>
                <li>升级spring-framework到最新版本5.3.39</li>
                <li>升级quill到最新版本2.0.2</li>
                <li>升级axios到最新版本0.28.1</li>
                <li>优化身份证脱敏正则</li>
                <li>优化权限更新后同步缓存</li>
                <li>优化查询时间范围日期格式</li>
                <li>优化参数键值更换为多行文本</li>
                <li>优化导入带标题文件关闭清理</li>
                <li>优化上传图片带域名不增加前缀</li>
                <li>优化特殊字符密码修改失败问题</li>
                <li>优化无用户编号不校验数据权限</li>
                <li>优化TopNav内链菜单点击没有高亮</li>
                <li>优化菜单管理切换Mini布局错乱问题</li>
                <li>其他细节优化</li>
              </ol>
            </el-collapse-item>
            <el-collapse-item title="v3.8.8 - 2024-06-30">
              <ol>
                <li>菜单管理新增路由名称</li>
                <li>新增数据脱敏过滤注解</li>
                <li>用户密码新增非法字符验证</li>
                <li>限制用户操作数据权限范围</li>
                <li>代码生成新增创建表结构功能</li>
                <li>定时任务白名单配置范围缩小</li>
                <li>优化代码生成主子表关联查询方式</li>
                <li>Excel注解新增属性comboReadDict</li>
                <li>Excel注解ColumnType类型新增文本</li>
                <li>新增国际化资源文件配置</li>
                <li>升级oshi到最新版本6.6.1</li>
                <li>升级druid到最新版本1.2.23</li>
                <li>升级core-js到最新版本3.37.1</li>
                <li>更新HttpUtils中的User-Agent</li>
                <li>更新compressionPlugin到6.1.2以兼容node18+</li>
                <li>升级spring-security到安全版本，防止漏洞风险</li>
                <li>升级spring-framework到安全版本，防止漏洞风险</li>
                <li>优化自定义XSS注解匹配方式</li>
                <li>优化缓存监控键名列表排序显示</li>
                <li>优化定时任务日志默认按时间排序</li>
                <li>优化默认文件大小超过2G无效的问题</li>
                <li>优化查表特殊字符使用反斜杠进行转义</li>
                <li>优化定时任务cron表达式小时配置显示错误问题</li>
                <li>优化多个自定数据权限使用in查询,避免多次拼接</li>
                <li>优化导入Excel时设置dictType属性重复查缓存问题</li>
                <li>其他细节优化</li>
              </ol>
            </el-collapse-item>
            <el-collapse-item title="v3.8.7 - 2023-12-08">
              <ol>
                <li>操作日志记录部门名称</li>
                <li>全局数据存储用户编号</li>
                <li>新增编程式判断资源访问权限</li>
                <li>操作日志列表新增IP地址查询</li>
                <li>定时任务新增页去除状态选项</li>
                <li>代码生成支持选择前端模板类型</li>
                <li>显隐列组件支持复选框弹出类型</li>
                <li>通用排序属性orderBy参数限制长度</li>
                <li>Excel自定义数据处理器增加单元格/工作簿对象</li>
                <li>升级oshi到最新版本6.4.8</li>
                <li>升级druid到最新版本1.2.20</li>
                <li>升级fastjson到最新版2.0.43</li>
                <li>升级pagehelper到最新版1.4.7</li>
                <li>升级commons.io到最新版本2.13.0</li>
                <li>升级element-ui到最新版本2.15.14</li>
                <li>修复五级路由缓存无效问题</li>
                <li>修复外链带端口出现的异常</li>
                <li>修复树模板父级编码变量错误</li>
                <li>修复字典表详情页面搜索问题</li>
                <li>修复内链iframe没有传递参数问题</li>
                <li>修复自定义字典样式不生效的问题</li>
                <li>修复字典缓存删除方法参数错误问题</li>
                <li>修复Excel导入数据临时文件无法删除问题</li>
                <li>修复未登录带参数访问成功后参数丢失问题</li>
                <li>修复HeaderSearch组件跳转query参数丢失问题</li>
                <li>修复代码生成导入后必填项与数据库不匹配问题</li>
                <li>修复Excels导入时无法获取到dictType字典值问题</li>
                <li>优化下载zip方法新增遮罩层</li>
                <li>优化头像上传参数新增文件名称</li>
                <li>优化字典标签支持自定义分隔符</li>
                <li>优化菜单管理类型为按钮状态可选</li>
                <li>优化前端防重复提交数据大小限制</li>
                <li>优化TopNav菜单没有图标svg不显示</li>
                <li>优化数字金额大写转换精度丢失问题</li>
                <li>优化富文本Editor组件检验图片格式</li>
                <li>优化页签在Firefox浏览器被遮挡的问题</li>
                <li>优化个人中心/基本资料修改时数据显示问题</li>
                <li>优化缓存监控图表支持跟随屏幕大小自适应调整</li>
                <li>其他细节优化</li>
              </ol>
            </el-collapse-item>
            <el-collapse-item title="v3.8.6 - 2023-06-30">
              <ol>
                <li>支持登录IP黑名单限制</li>
                <li>新增监控页面图标显示</li>
                <li>操作日志新增消耗时间属性</li>
                <li>屏蔽定时任务bean违规的字符</li>
                <li>日志管理使用索引提升查询性能</li>
                <li>日志注解支持排除指定的请求参数</li>
                <li>支持自定义隐藏属性列过滤子对象</li>
                <li>升级oshi到最新版本6.4.3</li>
                <li>升级druid到最新版本1.2.16</li>
                <li>升级fastjson到最新版2.0.34</li>
                <li>升级spring-boot到最新版本2.5.15</li>
                <li>升级element-ui到最新版本2.15.13</li>
                <li>移除apache/commons-fileupload依赖</li>
                <li>修复页面切换时布局错乱的问题</li>
                <li>修复匿名注解Anonymous空指针问题</li>
                <li>修复路由跳转被阻止时内部产生报错信息问题</li>
                <li>修复isMatchedIp的参数判断产生空指针的问题</li>
                <li>修复用户多角色数据权限可能出现权限抬升的情况</li>
                <li>修复开启TopNav后一级菜单路由参数设置无效问题</li>
                <li>修复DictTag组件value没有匹配的值时则展示value</li>
                <li>优化文件下载出现的异常</li>
                <li>优化选择图标组件高亮回显</li>
                <li>优化弹窗后导航栏偏移的问题</li>
                <li>优化修改密码日志存储明文问题</li>
                <li>优化页签栏关闭其他出现的异常问题</li>
                <li>优化页签关闭左侧选项排除首页选项</li>
                <li>优化关闭当前tab页跳转最右侧tab页</li>
                <li>优化缓存列表清除操作提示不变的问题</li>
                <li>优化字符未使用下划线不进行驼峰式处理</li>
                <li>优化用户导入更新时需获取用户编号问题</li>
                <li>优化侧边栏的平台标题与VUE_APP_TITLE保持同步</li>
                <li>优化导出Excel时设置dictType属性重复查缓存问题</li>
                <li>连接池Druid支持新的配置connectTimeout和socketTimeout</li>
                <li>其他细节优化</li>
              </ol>
            </el-collapse-item>
            <el-collapse-item title="v3.8.5 - 2023-01-01">
              <ol>
                <li>定时任务违规的字符</li>
                <li>重置时取消部门选中</li>
                <li>新增返回警告消息提示</li>
                <li>忽略不必要的属性数据返回</li>
                <li>修改参数键名时移除前缓存配置</li>
                <li>导入更新用户数据前校验数据权限</li>
                <li>兼容Excel下拉框内容过多无法显示的问题</li>
                <li>升级echarts到最新版本5.4.0</li>
                <li>升级core-js到最新版本3.25.3</li>
                <li>升级oshi到最新版本6.4.0</li>
                <li>升级kaptcha到最新版2.3.3</li>
                <li>升级druid到最新版本1.2.15</li>
                <li>升级fastjson到最新版2.0.20</li>
                <li>升级pagehelper到最新版1.4.6</li>
                <li>优化弹窗内容过多展示不全问题</li>
                <li>优化swagger-ui静态资源使用缓存</li>
                <li>开启TopNav没有子菜单隐藏侧边栏</li>
                <li>删除fuse无效选项maxPatternLength</li>
                <li>优化导出对象的子列表为空会出现[]问题</li>
                <li>优化编辑头像时透明部分会变成黑色问题</li>
                <li>优化小屏幕上修改头像界面布局错位的问题</li>
                <li>修复代码生成勾选属性无效问题</li>
                <li>修复文件上传组件格式验证问题</li>
                <li>修复回显数据字典数组异常问题</li>
                <li>修复sheet超出最大行数异常问题</li>
                <li>修复Log注解GET请求记录不到参数问题</li>
                <li>修复调度日志点击多次数据不变化的问题</li>
                <li>修复主题颜色在Drawer组件不会加载问题</li>
                <li>修复文件名包含特殊字符的文件无法下载问题</li>
                <li>修复table中更多按钮切换主题色未生效修复问题</li>
                <li>修复某些特性的环境生成代码变乱码TXT文件问题</li>
                <li>修复代码生成图片/文件/单选时选择必填无法校验问题</li>
                <li>修复某些特性的情况用户编辑对话框中角色和部门无法修改问题</li>
                <li>其他细节优化</li>
              </ol>
            </el-collapse-item>
            <el-collapse-item title="v3.8.4 - 2022-09-26">
              <ol>
                <li>数据逻辑删除不进行唯一验证</li>
                <li>Excel注解支持导出对象的子列表方法</li>
                <li>Excel注解支持自定义隐藏属性列</li>
                <li>Excel注解支持backgroundColor属性设置背景色</li>
                <li>支持配置密码最大错误次数/锁定时间</li>
                <li>登录日志新增解锁账户功能</li>
                <li>通用下载方法新增config配置选项</li>
                <li>支持多权限字符匹配角色数据权限</li>
                <li>页面内嵌iframe切换tab不刷新数据</li>
                <li>操作日志记录支持排除敏感属性字段</li>
                <li>修复多文件上传报错出现的异常问题</li>
                <li>修复图片预览组件src属性为null值控制台报错问题</li>
                <li>升级oshi到最新版本6.2.2</li>
                <li>升级fastjson到最新版2.0.14</li>
                <li>升级pagehelper到最新版1.4.3</li>
                <li>升级core-js到最新版本3.25.2</li>
                <li>升级element-ui到最新版本2.15.10</li>
                <li>优化任务过期不执行调度</li>
                <li>优化字典数据使用store存取</li>
                <li>优化修改资料头像被覆盖的问题</li>
                <li>优化修改用户登录账号重复验证</li>
                <li>优化代码生成同步后值NULL问题</li>
                <li>优化定时任务支持执行父类方法</li>
                <li>优化用户个人信息接口防止修改部门</li>
                <li>优化布局设置使用el-drawer抽屉显示</li>
                <li>优化没有权限的用户编辑部门缺少数据</li>
                <li>优化日志注解记录限制请求地址的长度</li>
                <li>优化excel/scale属性导出单元格数值类型</li>
                <li>优化日志操作中重置按钮时重复查询的问题</li>
                <li>优化多个相同角色数据导致权限SQL重复问题</li>
                <li>优化表格上右侧工具条（搜索按钮显隐&右侧样式凸出）</li>
                <li>其他细节优化</li>
              </ol>
            </el-collapse-item>
            <el-collapse-item title="v3.8.3 - 2022-06-27">
              <ol>
                <li>新增缓存列表菜单功能</li>
                <li>代码生成树表新增(展开/折叠)</li>
                <li>Excel注解支持color字体颜色</li>
                <li>新增Anonymous匿名访问不鉴权注解</li>
                <li>用户头像上传限制只能为图片格式</li>
                <li>接口使用泛型使其看到响应属性字段</li>
                <li>检查定时任务bean所在包名是否为白名单配置</li>
                <li>添加页签openPage支持传递参数</li>
                <li>用户缓存信息添加部门ancestors祖级列表</li>
                <li>升级element-ui到最新版本2.15.8</li>
                <li>升级oshi到最新版本6.1.6</li>
                <li>升级druid到最新版本1.2.11</li>
                <li>升级fastjson到最新版2.0.8</li>
                <li>升级spring-boot到最新版本2.5.14</li>
                <li>降级jsencrypt版本兼容IE浏览器</li>
                <li>删除多余的salt字段</li>
                <li>新增获取不带后缀文件名称方法</li>
                <li>新增获取配置文件中的属性值方法</li>
                <li>新增内容编码/解码方便插件集成使用</li>
                <li>字典类型必须以字母开头，且只能为（小写字母，数字，下滑线）</li>
                <li>优化设置分页参数默认值</li>
                <li>优化对空字符串参数处理的过滤</li>
                <li>优化显示顺序orderNum类型为整型</li>
                <li>优化表单构建按钮不显示正则校验</li>
                <li>优化字典数据回显样式下拉框显示值</li>
                <li>优化R响应成功状态码与全局保持一致</li>
                <li>优化druid开启wall过滤器出现的异常问题</li>
                <li>优化用户管理左侧树型组件增加选中高亮保持</li>
                <li>优化新增用户与角色信息&用户与岗位信息逻辑</li>
                <li>优化默认不启用压缩文件缓存防止node_modules过大</li>
                <li>修复字典数据显示不全问题</li>
                <li>修复操作日志查询类型条件为0时会查到所有数据</li>
                <li>修复Excel注解prompt/combo同时使用不生效问题</li>
                <li>其他细节优化</li>
              </ol>
            </el-collapse-item>
            <el-collapse-item title="v3.8.2 - 2022-04-01">
              <ol>
                <li>前端支持设置是否需要防止数据重复提交</li>
                <li>开启TopNav没有子菜单情况隐藏侧边栏</li>
                <li>侧边栏菜单名称过长悬停显示标题</li>
                <li>用户访问控制时校验数据权限，防止越权</li>
                <li>导出Excel时屏蔽公式，防止CSV注入风险</li>
                <li>组件ImagePreview支持多图预览显示</li>
                <li>组件ImageUpload支持多图同时选择上传</li>
                <li>组件FileUpload支持多文件同时选择上传</li>
                <li>服务监控新增运行参数信息显示</li>
                <li>定时任务目标字符串过滤特殊字符</li>
                <li>定时任务目标字符串验证包名白名单</li>
                <li>代码生成列表图片支持预览</li>
                <li>代码生成编辑修改打开新页签</li>
                <li>代码生成新增Java类型Boolean</li>
                <li>代码生成子表支持日期/字典配置</li>
                <li>代码生成同步保留必填/类型选项</li>
                <li>升级oshi到最新版本6.1.2</li>
                <li>升级fastjson到最新版1.2.80</li>
                <li>升级pagehelper到最新版1.4.1</li>
                <li>升级spring-boot到最新版本2.5.11</li>
                <li>升级spring-boot-mybatis到最新版2.2.2</li>
                <li>添加遗漏的分页参数合理化属性</li>
                <li>修改npm即将过期的注册源地址</li>
                <li>修复分页组件请求两次问题</li>
                <li>修复通用文件下载接口跨域问题</li>
                <li>修复Xss注解字段值为空时的异常问题</li>
                <li>修复选项卡点击右键刷新丢失参数问题</li>
                <li>修复表单清除元素位置未垂直居中问题</li>
                <li>修复服务监控中运行参数显示条件错误</li>
                <li>修复导入Excel时字典字段类型为Long转义为空问题</li>
                <li>修复登录超时刷新页面跳转登录页面还提示重新登录问题</li>
                <li>优化加载字典缓存数据</li>
                <li>优化IP地址获取到多个的问题</li>
                <li>优化任务队列满时任务拒绝策略</li>
                <li>优化文件上传兼容Weblogic环境</li>
                <li>优化定时任务默认保存到内存中执行</li>
                <li>优化部门修改缩放后出现的错位问题</li>
                <li>优化Excel格式化不同类型的日期对象</li>
                <li>优化菜单表关键字导致的插件报错问题</li>
                <li>优化Oracle用户头像列为空时不显示问题</li>
                <li>优化页面若未匹配到字典标签则返回原字典值</li>
                <li>优化修复登录失效后多次请求提示多次弹窗问题</li>
                <li>其他细节优化</li>
              </ol>
            </el-collapse-item>

          </el-collapse>
        </el-card>
      </el-col>
      <el-col :xs="24" :sm="24" :md="12" :lg="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span>添加客服</span>
          </div>
          <div class="body" style="text-align:center;">
            <img
              src="@/assets/images/pay.png"
              alt="donate"

              width="60%"
            />
            <span style="display: inline-block; height: 30px; line-height: 30px"
              >你可以添加客服了解订购相关问题</span
            >
          </div>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  name: "Index",
  data() {
    return {
      // 版本号
      version: "3.9.0"
    }
  },
  methods: {
    goTarget(href) {
      window.open(href, "_blank")
    }
  }
}
</script>

<style scoped lang="scss">
.home {
  body {
    background-color:#30B08F;/* 淡绿色背景 */
    color:#4AB7BD;
  }
  .app-container {
    background-color: #8cc5ff ;/* 内容区浅背景，与整体淡绿区分 */
    border-radius: 8px;
    box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1);
    padding: 20px;
    margin-top: 20px;
  }
  blockquote {
    padding: 10px 20px;
    margin: 0 0 20px;
    font-size: 17.5px;
    border-left: 5px solid #eee;
  }
  hr {
    margin-top: 20px;
    margin-bottom: 20px;
    border: 0;
    border-top: 1px solid #eee;
  }
  .col-item {
    margin-bottom: 20px;
  }

  ul {
    padding: 0;
    margin: 0;
  }

  font-family: "open sans", "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-size: 13px;
  color: #676a6c;
  overflow-x: hidden;

  ul {
    list-style-type: none;
  }

  h4 {
    margin-top: 0px;
  }

  h2 {
    margin-top: 10px;
    font-size: 26px;
    font-weight: 100;
  }

  p {
    margin-top: 10px;

    b {
      font-weight: 700;
    }
  }

  .update-log {
    ol {
      display: block;
      list-style-type: decimal;
      margin-block-start: 1em;
      margin-block-end: 1em;
      margin-inline-start: 0;
      margin-inline-end: 0;
      padding-inline-start: 40px;
    }
  }
}
</style>

