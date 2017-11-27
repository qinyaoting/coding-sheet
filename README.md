# simle 是springboot的第一个demo(2017-11--22)

- 变量可以写在配置文件中,也可以从命令行传入,命令行的优先级比配置文件中的要高
- OutputCapture类可以在junit中捕获System.out.print()输出的内容


# 问题

- @Rule是干什么的?



# cache (2017-11--23)
- ConcurrentMapCacheManager是springboot默认的缓存


#  问题
-  @Profile("app")
-  CacheManagerCheck中并没有指定, 用哪个缓存, 难道增加一个ehcache.xml就可以用ehcache了?(OK)
-  有多个cache怎么办(只能用一个)
-  pom增加依赖, 就可以使用RedisTemplate了,但是不知道在哪里配置redis地址和参数(配置中修改)

# guava (2017-11-23)

-  同时配置properties和yml的文件是可以的
-  同时使用guava和redis好像不行

#  问题
-  


