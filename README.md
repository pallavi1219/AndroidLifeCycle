# AndroidLifeCycle
*This application captures the android life cycle methods
* Various lifecycle flows can be recorded in Logcat.
-->
*  When application is launched
2019-02-13 21:58:52.656 10763-10763/com.example.hanupallavi.lifecycledemo D/lifecycle Test: OnCreate Finished.
2019-02-13 21:58:52.660 10763-10763/com.example.hanupallavi.lifecycledemo D/lifecycle Test: onStart Finished.
2019-02-13 21:58:52.661 10763-10763/com.example.hanupallavi.lifecycledemo D/lifecycle Test: onResume Finished.
-->
* On launching second activity
2019-02-13 22:00:20.249 10763-10763/com.example.hanupallavi.lifecycledemo D/lifecycle Test: onPause Finished.
2019-02-13 22:00:20.908 10763-10763/com.example.hanupallavi.lifecycledemo D/lifecycle Test: onStop Finished.
-->
* On back from the second activity to first activity.
2019-02-13 22:00:51.269 10763-10763/com.example.hanupallavi.lifecycledemo D/lifecycle Test: onRestart Finished.
2019-02-13 22:00:51.271 10763-10763/com.example.hanupallavi.lifecycledemo D/lifecycle Test: onStart Finished.
2019-02-13 22:00:51.274 10763-10763/com.example.hanupallavi.lifecycledemo D/lifecycle Test: onResume Finished.
-->
* On finish of the first activity
2019-02-13 22:01:41.141 10763-10763/com.example.hanupallavi.lifecycledemo D/lifecycle Test: onPause Finished.
2019-02-13 22:01:42.062 10763-10763/com.example.hanupallavi.lifecycledemo D/lifecycle Test: onStop Finished.
2019-02-13 22:01:42.068 10763-10763/com.example.hanupallavi.lifecycledemo D/lifecycle Test: onDestroy Finished.
-->
* When another application activity takes over the first activity ( example: phone call)
2019-02-13 22:02:55.613 10763-10763/com.example.hanupallavi.lifecycledemo D/lifecycle Test: onPause Finished.
2019-02-13 22:02:57.606 10763-10763/com.example.hanupallavi.lifecycledemo D/lifecycle Test: onStop Finished.
