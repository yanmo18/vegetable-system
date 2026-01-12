import Layout from '@/layout/index.vue';

const systemRoutes = [
  {
    path: '/message',
    component: Layout,
    name: 'Message',
    meta: {
      title: '留言管理',
      icon: 'message'
    },
    children: [
      {
        path: 'list',
        component: () => import('@/views/system/message/index.vue'),
        name: 'MessageList',
        meta: { title: '留言列表' }
      },
      {
        path: 'add',
        component: () => import('@/views/system/message/form.vue'),
        name: 'MessageAdd',
        meta: { title: '添加留言' }
      }
    ]
  }
];

export default systemRoutes;
