package com.xujun.funapp.beans;

import java.util.List;

/**
 * @author xujun  on 2016/12/28.
 * @email gdutxiaoxu@163.com
 */

public class WeChatJingXuan {

    public int ret_code;
    public PagebeanEntity pagebean;

    public static class PagebeanEntity {
        /**
         * allPages : 3432
         * contentlist : [{"date":"2016-12-28 13:05:39","weixinNum":"rmrbwx","url":"http://mp
         * .weixin.qq.com/s?__biz=MjM5MjAxNDM4MA==&mid=2666147418&idx=2&sn
         * =793a4060eec8097cbea28223a67f87c2&chksm
         * =bdb247198ac5ce0fef6b009cd3748c57efbc1424d92d9abac77457d5af230bc7b175d4b20ea8#rd",
         * "ct":"2016-12-28 18:30:41.194","id":"586394516e36a8dec72825e2","typeName":"热点",
         * "title":"【提醒】警方北京扫黄后有一类人马上行动了！背后套路真多","contentImg":"http://mmbiz.qpic
         * .cn/mmbiz_png/EPzenDPIR4dG0eOsLnJXE4qic6YDzAaicNxWAPibI1DEiaoKsJbkxXK550QEDD2gDylcZMYs6wZjCvoW4hqIIGfInQ/640?","userLogo":"http://mmbiz.qpic.cn/mmbiz/xrFYciaHL08CANmCkReiaffGxwG3icrCyoiauzgyuID7YH0XFRenmafvsWDmakLhj86KKiceO275nVzNiafRpotDLdicA/0?wx_fmt=png","userName":"人民日报","read_num":100001,"like_num":1488,"typeId":"0","userLogo_code":"http://open.weixin.qq.com/qr/code/?username=rmrbwx"},{"date":"2016-12-28 11:21:00","weixinNum":"wzchzgr","url":"http://mp.weixin.qq.com/s?__biz=MzAwMzU0MjUzMw==&mid=2651107792&idx=1&sn=8b040c30d61140bbf84d923850885393&chksm=80c98abab7be03acd13ec0270bafd40455a99d13c87b3bea1a0ab877a80a78e4a4a34a9490ec#rd","ct":"2016-12-28 18:30:41.190","id":"586394516e36a8dec72825e1","typeName":"热点","title":"详扒！万州大胡子洋芋再也吃不到了！到底怎么回事？","contentImg":"http://mmbiz.qpic.cn/mmbiz_jpg/hOpYGwLSv4RmILxKlFLQbbBwmU3RmpFhy0ssNuZjNHYj4z7NONa0YF67CQ9d8gOTPP1z1SO10iajKnGcPBVg48Q/0?wx_fmt=jpeg","userLogo":"http://mmbiz.qpic.cn/mmbiz/hOpYGwLSv4Rj13icLPbYHYFFd0icKZXrbj3WIWQNpDKjLHS6BWUkmB1ibceTlzNHsFR4CncytSVEjlaic8ormsvzHA/0?wx_fmt=png","userName":"万州吃货最光荣","read_num":100001,"like_num":72,"typeId":"0","userLogo_code":"http://open.weixin.qq.com/qr/code/?username=wzchzgr"},{"date":"2016-12-27 23:11:26","weixinNum":"shaofeidu","url":"http://mp.weixin.qq.com/s?__biz=MzAxMDI4ODIyNg==&mid=2723048616&idx=2&sn=d9f5590d031fbaf1bdb6eadcd4eab21f&chksm=bce861a58b9fe8b3b0647b3f0c22b2217bc819999742bf1d41dd8559cef578f0f22d48484152#rd","ct":"2016-12-28 18:30:40.163","id":"586394506e36a8dec72825dc","typeName":"热点","title":"2000块，让你穿成姑娘想睡的样子","contentImg":"http://mmbiz.qpic.cn/mmbiz_png/5gwgPtmAaSsicYEcWduU5HBsDl3KNQJ8ibKbSTPp0Lb1U39jWJfShuncMhibADAp210KCQuCxnzduoyqP8qz1G5OQ/s640?","userLogo":"http://mmbiz.qpic.cn/mmbiz/5gwgPtmAaSvz1HMvxjoYhvQeOfouJFOwzzLLrEBJpfohcxSJTLD3QqchvibBBP5ic1A6QficCJAicrt8tYbdeguZFg/0","userName":"杜绍斐","read_num":59908,"like_num":219,"typeId":"0","userLogo_code":"http://open.weixin.qq.com/qr/code/?username=shaofeidu"},{"date":"2016-12-28 13:31:29","weixinNum":"txws_txws","url":"http://mp.weixin.qq.com/s?__biz=MjMxNTM0NzE0MQ==&mid=2653255637&idx=1&sn=21fb94d8c11a3194bb6c2f0cf9d1bd88&chksm=b9ef447f8e98cd69ecec0401af4592e365dafa6ad67913a7e16977de4a8febd101c0546614ea#rd","ct":"2016-12-28 18:30:40.085","id":"586394506e36a8dec72825da","typeName":"推荐","title":"阿里CEO张勇：新零售的关键到底是什么？| 新网商峰会","contentImg":"http://mmbiz.qpic.cn/mmbiz_jpg/F3JRqPI2QJcWPRJur8Du2bvaC8LljMAocKd2cSfOzyVqyicn61UNjibeYnHAe7qJvXPicpoRkZ2wLvIGibibuRmCL0g/0?wx_fmt=jpeg","userLogo":"http://mmsns.qpic.cn/mmsns/F3JRqPI2QJdQsH09lYdiaMC50BrbbaibGNjCtEX1NswDsKxjiaFTPDamA/0","userName":"天下网商","read_num":11421,"like_num":46,"typeId":"1","userLogo_code":"http://open.weixin.qq.com/qr/code/?username=txws_txws"},{"date":"2016-12-28 12:06:51","weixinNum":"ibaby233","url":"http://mp.weixin.qq.com/s?__biz=MzI4NjEwNDMyNw==&mid=2706017202&idx=1&sn=db1dfbd2b10084afc646bbc1c91e8273&chksm=cf5c25daf82baccce2ddfcc5962ed163b03ea26c37dde049ea1d1f957466cbcbc84ad04cdbf4#rd","ct":"2016-12-28 18:30:38.876","id":"5863944e6e36a8dec72825d8","typeName":"热点","title":"生个儿子就要这样穿，帅呆了！","contentImg":"http://mmbiz.qpic.cn/mmbiz/CCWic1qUpoD92NGiax5O8EORajM9EoyvA5uUEl8aicDkiakE12fPA3kQUsyDsc8bvsXibgfmVDJgjFWG9xH6tKEiahqA/0","userLogo":"http://mmbiz.qpic.cn/mmbiz/n4335NEzseEapYSwooG3ia7ETd4XYl1WVS2CCkFt51iaTeIDicFAaGriaqNq2MicFmg2DxGqCSMbUF1dFiaiauutiaxicpA/0?wx_fmt=png","userName":"宝宝相册","read_num":91153,"like_num":162,"typeId":"0","userLogo_code":"http://open.weixin.qq.com/qr/code/?username=ibaby233"},{"date":"2016-12-28 00:02:08","weixinNum":"sxlxjlb","url":"http://mp.weixin.qq.com/s?__biz=MzA5NTI4NTAyOA==&mid=2652975633&idx=1&sn=0bc5449fc600c11b6e0566a645c31c52&chksm=8b94285abce3a14c55bebb69582a026703b584ca6a3b3617658a4cee48c948a4a35ccf291e45#rd","ct":"2016-12-28 18:30:38.618","id":"5863944e6e36a8dec72825d7","typeName":"热点","title":"厉害了！咱山西农民歌手将亮相央视2017新春联欢会，快看！","contentImg":"http://mmbiz.qpic.cn/mmbiz_png/ol72Wnba7fJAicFzCFhupmrTWiaSptRrPfGdy9BLn5mUL5pfRGDicm4IZN8wMs65sLAjk1KcE2wTppgkwIOPHYiadQ/0?wx_fmt=png","userLogo":"http://mmsns.qpic.cn/mmsns/ol72Wnba7fJQcGrQ74V7ZzMM4OWFfutNXEP7aVc26CYA0CXF1zMibSg/0","userName":"山西老乡俱乐部","read_num":69004,"like_num":258,"typeId":"0","userLogo_code":"http://open.weixin.qq.com/qr/code/?username=sxlxjlb"},{"date":"2016-12-28 08:07:47","weixinNum":"haibao_cn","url":"http://mp.weixin.qq.com/s?src=3&timestamp=1482919926&ver=1&signature=jMH7xTyRokI8uOUKPKSn2QE1QLVFv5MpPYCkGJhlckjbKja0du8USyfNLJ*9UR46Exd30LEuUqUPJ6hqOFj2IquH5CYbG3FQq*YOK7A7NQ*JVqCszWKLbLQXFlm5ykbGuNYuHdViyROEJ9ivO*W7vDO2EqSYKv40YbfGZqvtYw4=","ct":"2016-12-28 18:30:38.564","id":"5863944e6e36a8dec72825d6","typeName":"热点","title":"像她们这样会穿衣，你也能登上吸金榜Top5！","contentImg":"http://mmbiz.qpic.cn/mmbiz_jpg/mic8pHL2lAewN5bp7iaS2NzENQvJ7LVVwPPJHz5u2WfhZuw4knjCYklVibOFNTe4fKp8kKPX0WJU6bMYrUoU2YRSw/0?wx_fmt=jpeg","userLogo":"http://mmbiz.qpic.cn/mmbiz/mic8pHL2lAeyia0dVL6mHIy3dAcIwkoPLd21mVbDp6EKdm3VR3tzdohEJNwtT6SfmEoKVFo7cAcnMQEahFxpY5OA/0?wx_fmt=png","userName":"海报网","read_num":59601,"like_num":90,"typeId":"0","userLogo_code":"http://open.weixin.qq.com/qr/code/?username=haibao_cn"},{"date":"2016-12-28 12:26:47","weixinNum":"gougou2016","url":"http://mp.weixin.qq.com/s?__biz=MzA4Mzk4NTUwMA==&mid=2653505507&idx=1&sn=2cd74a7247d949bb921ac4654f11c706&chksm=8433f2d0b3447bc6c07331f28152f15f493e52becb5ad9d68a2648a3db30735549c4f808aba3#rd","ct":"2016-12-28 18:30:38.023","id":"5863944e6e36a8dec72825d5","typeName":"热点","title":"撒手没二哈，这次撒开了手，就真的没了","contentImg":"http://mmbiz.qpic.cn/mmbiz_png/UC6M1Hf0SSEsCuLW2o6VX8xIn4MY7ibn6CxObN9njDjALGiceCx3uDMibHlyAXPFt8NhHEZOOsASvo57j0UiaRV1pA/0?wx_fmt=png","userLogo":"http://mmbiz.qpic.cn/mmbiz/UC6M1Hf0SSHntiafdLrBBpBEu6Ch0bd8MONO8bBGBCF85tozdaGJqGqiaDP5UeSN9TRT5ObazUIFBib10MtEJibV7w/0","userName":"大爱狗狗控","read_num":94504,"like_num":727,"typeId":"0","userLogo_code":"http://open.weixin.qq.com/qr/code/?username=gougou2016"},{"date":"2016-12-27 21:14:02","weixinNum":"ycqznr520","url":"http://mp.weixin.qq.com/s?__biz=MjM5OTY2NTI5Mw==&mid=2653800158&idx=1&sn=e4aac746e1fca9f2961ad8a201be9f69&chksm=bce16d3c8b96e42a812757c7322f474a4dcd13bc85610838b80d056a3479a4296cf2cb70e913#rd","ct":"2016-12-28 18:30:37.964","id":"5863944d6e36a8dec72825d4","typeName":"热点","title":"刘嘉玲：女人，千万不要轻易放弃自己","contentImg":"http://mmbiz.qpic.cn/mmbiz_jpg/G3fAFnQ1CotR2AHaUh4C2H5RN6KAWRjWMTsz0Jhqsia14vStHlFgVSzs59rEYlzTvKp3emj3QknNKwHDUM8sTnQ/0?wx_fmt=jpeg","userLogo":"http://mmbiz.qpic.cn/mmbiz/G3fAFnQ1CouVsFrT1nDv1mibKmLPqo65f94yqlciaK84SicMmq5ibfiaONKEw7GDXicibCCuibzyictsiaTSULc8CcqSBzPQ/0?wx_fmt=png","userName":"气质女人","read_num":57732,"like_num":455,"typeId":"0","userLogo_code":"http://open.weixin.qq.com/qr/code/?username=ycqznr520"},{"date":"2016-12-27 23:57:13","weixinNum":"kejimx","url":"http://mp.weixin.qq.com/s?src=3&timestamp=1482919928&ver=1&signature=RbnX4tUBODpql9qsvp4jJRDrtHc-LSXXm9gSM*BNY*OyqP5sM0gTt*knBXxpkhPmA5MKkUgsx7C*t0JsISXVqs746Z-ugUCgoTyC-IxlEJIKGJc4*QiPQjvCK6c5rHJy400Wf8NJchGi5MwGj0F1KdN0s9mbasniqCJnpDXekPU=","ct":"2016-12-28 18:30:37.392","id":"5863944d6e36a8dec72825d2","typeName":"推荐","title":"小米正式成立银行！紧追阿里腾讯","contentImg":"http://mmbiz.qpic.cn/mmbiz_jpg/TWTeiaAEGYy87B1av75JtWPRPRDzY66mgLtcbW3jRBthJWdiaVCsQPsmGZPqsibF54DdWKXjKB4QaTIOVibTY81vww/0?wx_fmt=jpeg","userLogo":"http://mmbiz.qpic.cn/mmbiz/TWTeiaAEGYyicmJ8NZoAW2Tfy8Bgdu9azmOaicWabv4MRF36cWjmyLVibV2KoM55qbdsTrlkRbiaSycFXQg2M4tJQ2A/0","userName":"科技美学","read_num":58311,"like_num":144,"typeId":"1","userLogo_code":"http://open.weixin.qq.com/qr/code/?username=kejimx"},{"date":"2016-12-27 19:23:19","weixinNum":"fcwm520","url":"http://mp.weixin.qq.com/s?__biz=MjA0MTg1NjMyMA==&mid=2651765266&idx=4&sn=8b634fbd0e08edf9b7f37a1ebf0ef5de&chksm=4a71ac3d7d06252ba4a0e251f9771ca7beee3eebc290b93c5dd3cded41d04bc29cf2b2ce5b95#rd","ct":"2016-12-28 18:30:37.251","id":"5863944d6e36a8dec72825d0","typeName":"推荐","title":"名副其实的白富美，不过也是追星的小迷妹，王文也告诉你追星也是土豪来的快！","contentImg":"http://mmbiz.qpic.cn/mmbiz_jpg/EvicSclfR4BWOwJ3yDrib3GvrwCLe67kegSvrFqCHB4h2ZfL2aPI9VicGeTl7QdUTEeMibicnGiahd4Ab5Jow3SWQIWQ/0?wx_fmt=jpeg","userLogo":"http://mmbiz.qpic.cn/mmbiz_png/EvicSclfR4BVgkCgzs0PjWcw7mAC0qusW6GmiaG3icGQibL8Q8WDNwlwV3rqzs8HO84PBzaVplsB13fLXDOAjrgWKw/0?wx_fmt=png","userName":"美美娱乐","read_num":58131,"like_num":113,"typeId":"1","userLogo_code":"http://open.weixin.qq.com/qr/code/?username=fcwm520"},{"date":"2016-12-27 18:12:17","weixinNum":"duowan-com","url":"http://mp.weixin.qq.com/s?src=3&timestamp=1482919928&ver=1&signature=W4kgMJGb7tlWjXi7B-3-5HH0k*CXR442EL5YZxYqDzxppqg2LVoq7ZhXeN1BlUE2KIW4-zcTSDBCdAwkvGGmLTPwE7dVGMb1y8jW*wa-nqDWl3DcOYl0bRDcREg6uDfyuY3MC7ifuHFab2AQdbwzBv3Ej0*8QmSordyklHM0Bdc=","ct":"2016-12-28 18:30:37.248","id":"5863944d6e36a8dec72825cf","typeName":"推荐","title":"网易新游：《逆水寒》首位女性角色曝光 首测信息已露出","contentImg":"http://mmbiz.qpic.cn/mmbiz_jpg/B31cTzJ3svqvFib5ltLIP0NUvHyy4JSmrkN4FB2e2Tx0G16KIGr2U6w6hHBEBSY7pRbzMsucUnLFoHrQ49efAibw/0?wx_fmt=jpeg","userLogo":"http://mmbiz.qpic.cn/mmbiz/B31cTzJ3svrj4A7Q3e6pWz17nHrfU7Apy33Nd3USM1AW0Gwu7XoGBXniaGO39sg8ooeOswTvs0JcHM3GYRrwUuA/0?wx_fmt=png","userName":"多玩游戏网","read_num":550,"like_num":4,"typeId":"1","userLogo_code":"http://open.weixin.qq.com/qr/code/?username=duowan-com"},{"date":"2016-12-28 13:26:23","weixinNum":"elongtrip","url":"http://mp.weixin.qq.com/s?__biz=MzA4MDA0NTAyOQ==&mid=2650410018&idx=1&sn=c7484358b83792e08c68749128d8ae99&chksm=87a49aa8b0d313becf609c3ddcf228ce0549ad9c6ce581e4d58910644ab28db868dcee24e76b#rd","ct":"2016-12-28 18:30:37.240","id":"5863944d6e36a8dec72825ce","typeName":"推荐","title":"比西藏还淳朴自然的地方 中国的童话古村丹巴藏寨","contentImg":"http://mmbiz.qpic.cn/mmbiz_jpg/5Ytj6YJXo2BywmsWNWwDh852ZBUicPib9Jg7TgzEZrMakfGqgGfrDz8pKVY75Sn57TU7ZWWYYfHXweyJkicjThFMA/0?wx_fmt=jpeg","userLogo":"http://mmbiz.qpic.cn/mmbiz/5Ytj6YJXo2A6jnI3CCxTh2quUBbVyBZC0Xd7Z12OOwxNzPkHg01ibm1pe1DEcqOXx6dCDyNo7XyDh17jE1MDljw/0","userName":"艺龙旅游指南","read_num":947,"like_num":1,"typeId":"1","userLogo_code":"http://open.weixin.qq.com/qr/code/?username=elongtrip"},{"date":"2016-12-28 14:04:32","weixinNum":"nbdnews","url":"http://mp.weixin.qq.com/s?__biz=ODYzMzExMzQx&mid=2652697252&idx=1&sn=6f5e316fecc4b25ed39fa8e6d10c8e88&chksm=00a2b02637d53930890aa2b2c19b44b2b3e5c1b1733f4002bb947d186e6de5be706e494bdca1#rd","ct":"2016-12-28 18:30:36.850","id":"5863944c6e36a8dec72825cb","typeName":"推荐","title":"万能险监管风暴第二波来临，保监会又对这两家公司下了狠手！","contentImg":"http://mmbiz.qpic.cn/mmbiz_png/ajT9KUbORcxIibKgDibUxaTr48mSib6UACupLZJmWEVlvYf000H2OZT3SmAn5KWGnKChm69duSOicHXm3APUCiceN1w/0?wx_fmt=png","userLogo":"http://mmbiz.qpic.cn/mmbiz/ajT9KUbORcxZrQ8cabViajDKkWMInusQfkpcPsuhHN49h4KE3QdqMLA6cVHz9iaxFvxmKqiaWoobrObeL1eyZcic1Q/0?wx_fmt=png","userName":"每日经济新闻","read_num":13567,"like_num":14,"typeId":"1","userLogo_code":"http://open.weixin.qq.com/qr/code/?username=nbdnews"},{"date":"2016-12-27 18:13:42","weixinNum":"shouyou178","url":"http://mp.weixin.qq.com/s?src=3&timestamp=1482919928&ver=1&signature=tb3WAlRUVTgFJGdiHQ*4-2zpIoTzpKAkFmvgnHMoWJSE9tnrsG9CJMNunZrEmoqMAuMnG4xSwX1bMqY7DHKK0UksUsbAlPNWCTzfqlTUSTmCJvGZW1nwp*JUOjwiEifjbfaQwU0oI1Rq5ka*JRsvgvcz08J6jYy3WDHihmx3d*A=","ct":"2016-12-28 18:30:36.124","id":"5863944c6e36a8dec72825c9","typeName":"推荐","title":"1块钱？！强迫症收集癖的福音，据说冒险与挖矿就送首席客服","contentImg":"http://mmbiz.qpic.cn/mmbiz_jpg/E6icBVpfbicDuFiczX6HrcicIRAsbbObTHiasOr7yrWh2ldCprTzod5iaXibvCcFgIpnJmEtUib8ibrQ0ib3xtibnzvZxOClg/0?wx_fmt=jpeg","userLogo":"http://mmbiz.qpic.cn/mmbiz/E6icBVpfbicDsugBlrVrBKNz05pAOdPdEqqicW46aZSCQKVWR8fjHhRzk8icdu3Xsjehib2yXXYvpibkDyqxgbZOibr7w/0","userName":"智珠178手游控","read_num":497,"like_num":4,"typeId":"1","userLogo_code":"http://open.weixin.qq.com/qr/code/?username=shouyou178"},{"date":"2016-12-28 13:25:46","weixinNum":"jingdianhuiben","url":"http://mp.weixin.qq.com/s?src=3&timestamp=1482919952&ver=1&signature=ZPoQ4IkQsCWb7xPYilrkZmi51QJnZZDLTZZH2bpjCfF7zmw*LD7pk9rgmcbU8v39cndNRF2V8MkV*kyYLQjDA*sqF2tI3KX6T4DAZf3rk4tSqdFYZQTxxZqjkXQwRhMYdX6M5i1gaB8bdj5weXCUYKstWql8xwP5WOhgRHGevWw=","ct":"2016-12-28 18:30:31.287","id":"586394476e36a8dec72825c4","typeName":"学霸族","title":"独家对话 | 曹文轩：阅读给孩子一个丰富的童年，写作是一个人的基本美德","contentImg":"http://mmbiz.qpic.cn/mmbiz_jpg/K7rOtEJZCrsLh6yYCiaa6wmCk3NiazuuY3ZPpspyNibumicia7ELnRchtENhRbYUmY9djY3yaMNsOnA28TNF5ux0FXQ/0?wx_fmt=jpeg","userLogo":"http://mmbiz.qpic.cn/mmbiz/K7rOtEJZCruF1sFubSEVEE1RynhZETlrwzw9LDu92j7jx3YXWFUZT2ystPehbwaH0R2SgRJ8icD8y9yEsN9gEcw/0?wx_fmt=png","userName":"哈爸哼妈","read_num":9179,"like_num":104,"typeId":"17","userLogo_code":"http://open.weixin.qq.com/qr/code/?username=jingdianhuiben"},{"date":"2016-12-23 09:19:30","weixinNum":"LenovoMIA","url":"http://mp.weixin.qq.com/s?src=3&timestamp=1482919952&ver=1&signature=CmC6D9vFBMO9JjTL7NSBfspcG5hIhfl0JxIvYFLXzvKCNgjj3Jqz-119CdocgSwq85XFwIlkTqIUqNv1MTu4XT2epFS4YdfkHoMmNhz5xRurbY0Xsjf5xblbRH*zudAci95t3JGF26*jvsj8VhuDela-bu-EyrK5-MS-Tq5gC20=","ct":"2016-12-28 18:30:31.274","id":"586394476e36a8dec72825c3","typeName":"学霸族","title":"雾霾预警，学校该不该停课？","contentImg":"http://mmbiz.qpic.cn/mmbiz_jpg/2RfMuXDCTaOHOkpVa4LHIo6Psxn6MW9BIiaH1ycYSPBaZaqH7R2mPAF5iau2IP0xpibCyg8AQZ8fFYSm0RL8hbAyA/0?wx_fmt=jpeg","userLogo":"http://mmbiz.qpic.cn/mmbiz/2RfMuXDCTaNiaibS2WPXibTa2abHDnibx7iceYT7z0WUeJP0XuibM9e4YOcobOAOeiabiaVXXdL6aZ8ZbqjapnwfrXmohA/0?wx_fmt=png","userName":"联想移动互联行业应用","read_num":102,"like_num":2,"typeId":"17","userLogo_code":"http://open.weixin.qq.com/qr/code/?username=LenovoMIA"},{"date":"2016-12-28 13:52:39","weixinNum":"huaienshushe","url":"http://mp.weixin.qq.com/s?src=3&timestamp=1482919951&ver=1&signature=coab7v9aNa6RtaqM0RJl86NV9f-Qd0kOQp3FvbxkUdBaKcMKFqrx4uu9HvNW1AUCW0mK3PwxdFnT3zb11x5LSkdlBLu9P-IrMTOd*r60xqZUUGZi-a47CExI*l7LmbU9S4BCAoXNnbM3V0JfqLegwgMDsIldaf*I*rw-yEsIrok=","ct":"2016-12-28 18:30:31.030","id":"586394476e36a8dec72825c0","typeName":"古今通","title":"把自己的家庭修成西方极乐世界","contentImg":"http://mmbiz.qpic.cn/mmbiz_jpg/UHDc9UHiapcd4LClYMSZHia8Lv2PnWBXXraF9CcWUboCCKsEOY7ibryOwhBQpztRJUdeIHe00CicbVqsibbATo9t5rw/0?wx_fmt=jpeg","userLogo":"http://mmbiz.qpic.cn/mmbiz/UHDc9UHiapcdeVyrJX0tpb0vxkR5HicmPvwZkb2BfNvDcnfTKhFz4D4hQT14ictcSqqTACPibd9RkcY3hsnNZqcfYg/0","userName":"怀恩书社","read_num":948,"like_num":15,"typeId":"16","userLogo_code":"http://open.weixin.qq.com/qr/code/?username=huaienshushe"},{"date":"2016-12-28 13:33:47","weixinNum":"historytalking","url":"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx55db64d265e84478&redirect_uri=https%3A%2F%2Ftrade.koudaitong.com%2Fcommon%2Fwxauth&response_type=code&scope=snsapi_base&state=https%3A%2F%2Fkdt.im%2FekKHOr&component_appid=wx7cd6227fafe53336#wechat_redirect","ct":"2016-12-28 18:30:31.028","id":"586394476e36a8dec72825bf","typeName":"古今通","title":"一场大唐圣诞节轰趴背后的\u201c景教消亡史\u201d","contentImg":"http://mmbiz.qpic.cn/mmbiz_png/twJ0sHRp5KchtH1aFNz1QUIBs6Jh0nIqiacq7GZKeLX5Rc7OJ0erxHPNrVg9ic11lhe809jLrsDgREv00suEibJEQ/0?wx_fmt=png","userLogo":"http://mmbiz.qpic.cn/mmbiz/twJ0sHRp5KevljPbwO8AibrtM0LvB6pHp7AyYUEArxnPkX0O5KgicJNqAkIOAq6iciaqstN3kw6rUGvdiaBMheoXvIw/0","userName":"时拾史事","read_num":4395,"like_num":24,"typeId":"16","userLogo_code":"http://open.weixin.qq.com/qr/code/?username=historytalking"},{"date":"2016-12-28 13:33:48","weixinNum":"dushi818","url":"http://mp.weixin.qq.com/s?__biz=MzA5NDExMDUxNA==&mid=2651199809&idx=1&sn=c0d091c49cab945d7b9a7df310fbcff9&chksm=8ba12f1cbcd6a60a19467da47b8109cd341c40792332e2fd989e2f8601193489ca4bee4991f5#rd","ct":"2016-12-28 18:30:31.009","id":"586394476e36a8dec72825be","typeName":"古今通","title":"晚清第一硬汉左宗棠到底是怎么死的？（绝对好文）","contentImg":"http://mmbiz.qpic.cn/mmbiz/ap0qTvmx8IDkpb3rZShxPyQJ7JvFel1oW2icCzqh7JsKaT47PpUceeribG0sL2LjfhZUAgZBVvFpyMIicKrZ91Aog/640","userLogo":"http://mmsns.qpic.cn/mmsns/ap0qTvmx8IC6XEn53lHoE9Kzz4nGTyrpVnmyYOicopJHIGQOgPAEiazA/0","userName":"读史","read_num":39962,"like_num":450,"typeId":"16","userLogo_code":"http://open.weixin.qq.com/qr/code/?username=dushi818"}]
         * currentPage : 1
         * allNum : 68632
         * maxResult : 20
         */

        public int allPages;
        public int currentPage;
        public int allNum;
        public int maxResult;
        public List<ContentlistEntity> contentlist;

        public static class ContentlistEntity {
            /**
             * date : 2016-12-28 13:05:39
             * weixinNum : rmrbwx
             * url : http://mp.weixin.qq
             * .com/s?__biz=MjM5MjAxNDM4MA==&mid=2666147418&idx=2&sn
             * =793a4060eec8097cbea28223a67f87c2&chksm
             * =bdb247198ac5ce0fef6b009cd3748c57efbc1424d92d9abac77457d5af230bc7b175d4b20ea8#rd
             * ct : 2016-12-28 18:30:41.194
             * id : 586394516e36a8dec72825e2
             * typeName : 热点
             * title : 【提醒】警方北京扫黄后有一类人马上行动了！背后套路真多
             * contentImg : http://mmbiz.qpic
             * .cn/mmbiz_png/EPzenDPIR4dG0eOsLnJXE4qic6YDzAaicNxWAPibI1DEiaoKsJbkxXK550QEDD2gDylcZMYs6wZjCvoW4hqIIGfInQ/640?
             * userLogo : http://mmbiz.qpic
             * .cn/mmbiz/xrFYciaHL08CANmCkReiaffGxwG3icrCyoiauzgyuID7YH0XFRenmafvsWDmakLhj86KKiceO275nVzNiafRpotDLdicA/0?wx_fmt=png
             * userName : 人民日报
             * read_num : 100001
             * like_num : 1488
             * typeId : 0
             * userLogo_code : http://open.weixin.qq.com/qr/code/?username=rmrbwx
             */

            public String date;
            public String weixinNum;
            public String url;
            public String ct;
            public String id;
            public String typeName;
            public String title;
            public String contentImg;
            public String userLogo;
            public String userName;
            public int read_num;
            public int like_num;
            public String typeId;
            public String userLogo_code;
        }
    }
}
