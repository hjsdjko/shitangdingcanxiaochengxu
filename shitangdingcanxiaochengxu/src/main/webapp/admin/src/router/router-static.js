import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import address from '@/views/modules/address/list'
    import caipin from '@/views/modules/caipin/list'
    import caipinCollection from '@/views/modules/caipinCollection/list'
    import caipinCommentback from '@/views/modules/caipinCommentback/list'
    import caipinOrder from '@/views/modules/caipinOrder/list'
    import cart from '@/views/modules/cart/list'
    import dictionary from '@/views/modules/dictionary/list'
    import forum from '@/views/modules/forum/list'
    import gonglue from '@/views/modules/gonglue/list'
    import gonglueLiuyan from '@/views/modules/gonglueLiuyan/list'
    import news from '@/views/modules/news/list'
    import shangjia from '@/views/modules/shangjia/list'
    import yonghu from '@/views/modules/yonghu/list'
    import config from '@/views/modules/config/list'
    import dictionaryCaipin from '@/views/modules/dictionaryCaipin/list'
    import dictionaryCaipinCollection from '@/views/modules/dictionaryCaipinCollection/list'
    import dictionaryCaipinOrder from '@/views/modules/dictionaryCaipinOrder/list'
    import dictionaryCaipinOrderPayment from '@/views/modules/dictionaryCaipinOrderPayment/list'
    import dictionaryCaipinOrderStatus from '@/views/modules/dictionaryCaipinOrderStatus/list'
    import dictionaryForumState from '@/views/modules/dictionaryForumState/list'
    import dictionaryGonglue from '@/views/modules/dictionaryGonglue/list'
    import dictionaryIsdefault from '@/views/modules/dictionaryIsdefault/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShangjiaXingji from '@/views/modules/dictionaryShangjiaXingji/list'
    import dictionaryShangxia from '@/views/modules/dictionaryShangxia/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryCaipin',
        name: '商品类型',
        component: dictionaryCaipin
    }
    ,{
        path: '/dictionaryCaipinCollection',
        name: '收藏表类型',
        component: dictionaryCaipinCollection
    }
    ,{
        path: '/dictionaryCaipinOrder',
        name: '订单类型',
        component: dictionaryCaipinOrder
    }
    ,{
        path: '/dictionaryCaipinOrderPayment',
        name: '订单支付类型',
        component: dictionaryCaipinOrderPayment
    }
    ,{
        path: '/dictionaryCaipinOrderStatus',
        name: '取餐类型',
        component: dictionaryCaipinOrderStatus
    }
    ,{
        path: '/dictionaryForumState',
        name: '帖子状态',
        component: dictionaryForumState
    }
    ,{
        path: '/dictionaryGonglue',
        name: '攻略类型',
        component: dictionaryGonglue
    }
    ,{
        path: '/dictionaryIsdefault',
        name: '是否默认地址',
        component: dictionaryIsdefault
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShangjiaXingji',
        name: '商家信用类型',
        component: dictionaryShangjiaXingji
    }
    ,{
        path: '/dictionaryShangxia',
        name: '上下架',
        component: dictionaryShangxia
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/address',
        name: '收货地址',
        component: address
      }
    ,{
        path: '/caipin',
        name: '商品',
        component: caipin
      }
    ,{
        path: '/caipinCollection',
        name: '商品收藏',
        component: caipinCollection
      }
    ,{
        path: '/caipinCommentback',
        name: '商品评价',
        component: caipinCommentback
      }
    ,{
        path: '/caipinOrder',
        name: '商品订单',
        component: caipinOrder
      }
    ,{
        path: '/cart',
        name: '购物车',
        component: cart
      }
    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/forum',
        name: '论坛',
        component: forum
      }
    ,{
        path: '/gonglue',
        name: '攻略信息',
        component: gonglue
      }
    ,{
        path: '/gonglueLiuyan',
        name: '攻略评论',
        component: gonglueLiuyan
      }
    ,{
        path: '/news',
        name: '公告信息',
        component: news
      }
    ,{
        path: '/shangjia',
        name: '商家',
        component: shangjia
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
