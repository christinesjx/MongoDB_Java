# Jiaxin Sun HW4


# Project Structure

There are 3 classes:
	Main.java
	UnzippedFile -- Unzipping the smartwatch data
	JsonToMongoDB.java  -- Setting up mongoDB and parsing unzipped json file into mongoDB
	Searching.java -- contains 3 methods that are needed for this homework. 


# demo
Choose sensor: 
    0. Quit
    1. Heart Rate Number
    2. Running Activity
    3. Count Step On Date
Input integer:
1
Input month:jun
Input day:15
Input year:2016

You have received 30 heart-rate on your watch on jun/15/2016

Choose sensor: 
    0. Quit
    1. Heart Rate Number
    2. Running Activity
    3. Count Step On Date
Input integer:
2
Input month:jun
Input day:19
Input year:2016

Yes, you ran from sun jun 19 14:18:57 edt 2016 to sun jun 19 14:20:00 edt 2016

Choose sensor: 
    0. Quit
    1. Heart Rate Number
    2. Running Activity
    3. Count Step On Date
Input integer:
3
How many steps did I walk on 
Input month:mar
Input day:22
Input year:2017

You walk 1778 steps

Choose sensor: 
    0. Quit
    1. Heart Rate Number
    2. Running Activity
    3. Count Step On Date
Input integer:
0

Process finished with exit code 0



#demo validation with output (Same input as above)

Choose sensor: 
    0. Quit
    1. Heart Rate Number
    2. Running Activity
    3. Count Step On Date
Input integer:
1
Input month:jun
Input day:15
Input year:2016

Document{{_id=5da3f0a32309471f796cbd82, sensor_name=heartrate, timestamp=wed jun 15 09:30:02 edt 2016, sensor_data=Document{{bpm=83}}}}
Document{{_id=5da3f0a32309471f796cbd83, sensor_name=heartrate, timestamp=wed jun 15 09:35:00 edt 2016, sensor_data=Document{{bpm=79}}}}
Document{{_id=5da3f0a32309471f796cbd84, sensor_name=heartrate, timestamp=wed jun 15 09:40:00 edt 2016, sensor_data=Document{{bpm=85}}}}
Document{{_id=5da3f0a32309471f796cbd85, sensor_name=heartrate, timestamp=wed jun 15 10:04:54 edt 2016, sensor_data=Document{{bpm=74}}}}
Document{{_id=5da3f0a32309471f796cbd86, sensor_name=heartrate, timestamp=wed jun 15 10:40:01 edt 2016, sensor_data=Document{{bpm=85}}}}
Document{{_id=5da3f0a32309471f796cbd87, sensor_name=heartrate, timestamp=wed jun 15 11:12:02 edt 2016, sensor_data=Document{{bpm=90}}}}
Document{{_id=5da3f0a32309471f796cbd88, sensor_name=heartrate, timestamp=wed jun 15 11:54:37 edt 2016, sensor_data=Document{{bpm=60}}}}
Document{{_id=5da3f0a32309471f796cbd89, sensor_name=heartrate, timestamp=wed jun 15 12:36:35 edt 2016, sensor_data=Document{{bpm=74}}}}
Document{{_id=5da3f0a32309471f796cbd8a, sensor_name=heartrate, timestamp=wed jun 15 12:40:00 edt 2016, sensor_data=Document{{bpm=110}}}}
Document{{_id=5da3f0a32309471f796cbd8b, sensor_name=heartrate, timestamp=wed jun 15 13:10:42 edt 2016, sensor_data=Document{{bpm=83}}}}
Document{{_id=5da3f0a32309471f796cbd8c, sensor_name=heartrate, timestamp=wed jun 15 13:50:02 edt 2016, sensor_data=Document{{bpm=89}}}}
Document{{_id=5da3f0a32309471f796cbd8d, sensor_name=heartrate, timestamp=wed jun 15 14:34:54 edt 2016, sensor_data=Document{{bpm=67}}}}
Document{{_id=5da3f0a32309471f796cbd8e, sensor_name=heartrate, timestamp=wed jun 15 14:35:00 edt 2016, sensor_data=Document{{bpm=80}}}}
Document{{_id=5da3f0a32309471f796cbd8f, sensor_name=heartrate, timestamp=wed jun 15 14:40:00 edt 2016, sensor_data=Document{{bpm=88}}}}
Document{{_id=5da3f0a32309471f796cbd90, sensor_name=heartrate, timestamp=wed jun 15 15:10:02 edt 2016, sensor_data=Document{{bpm=92}}}}
Document{{_id=5da3f0a32309471f796cbd91, sensor_name=heartrate, timestamp=wed jun 15 15:42:34 edt 2016, sensor_data=Document{{bpm=137}}}}
Document{{_id=5da3f0a32309471f796cbd92, sensor_name=heartrate, timestamp=wed jun 15 16:20:02 edt 2016, sensor_data=Document{{bpm=71}}}}
Document{{_id=5da3f0a32309471f796cbd93, sensor_name=heartrate, timestamp=wed jun 15 16:59:51 edt 2016, sensor_data=Document{{bpm=68}}}}
Document{{_id=5da3f0a32309471f796cbd94, sensor_name=heartrate, timestamp=wed jun 15 17:34:54 edt 2016, sensor_data=Document{{bpm=59}}}}
Document{{_id=5da3f0a32309471f796cbd95, sensor_name=heartrate, timestamp=wed jun 15 17:35:00 edt 2016, sensor_data=Document{{bpm=90}}}}
Document{{_id=5da3f0a32309471f796cbd96, sensor_name=heartrate, timestamp=wed jun 15 17:40:00 edt 2016, sensor_data=Document{{bpm=78}}}}
Document{{_id=5da3f0a32309471f796cbd97, sensor_name=heartrate, timestamp=wed jun 15 18:12:45 edt 2016, sensor_data=Document{{bpm=60}}}}
Document{{_id=5da3f0a32309471f796cbd98, sensor_name=heartrate, timestamp=wed jun 15 18:50:46 edt 2016, sensor_data=Document{{bpm=90}}}}
Document{{_id=5da3f0a32309471f796cbd99, sensor_name=heartrate, timestamp=wed jun 15 19:29:50 edt 2016, sensor_data=Document{{bpm=77}}}}
Document{{_id=5da3f0a32309471f796cbd9a, sensor_name=heartrate, timestamp=wed jun 15 20:06:06 edt 2016, sensor_data=Document{{bpm=89}}}}
Document{{_id=5da3f0a32309471f796cbd9b, sensor_name=heartrate, timestamp=wed jun 15 20:50:05 edt 2016, sensor_data=Document{{bpm=90}}}}
Document{{_id=5da3f0a32309471f796cbd9c, sensor_name=heartrate, timestamp=wed jun 15 21:34:55 edt 2016, sensor_data=Document{{bpm=74}}}}
Document{{_id=5da3f0a32309471f796cbd9d, sensor_name=heartrate, timestamp=wed jun 15 22:09:52 edt 2016, sensor_data=Document{{bpm=67}}}}
Document{{_id=5da3f0a32309471f796cbd9e, sensor_name=heartrate, timestamp=wed jun 15 22:42:44 edt 2016, sensor_data=Document{{bpm=90}}}}
Document{{_id=5da3f0a32309471f796cbd9f, sensor_name=heartrate, timestamp=wed jun 15 23:27:54 edt 2016, sensor_data=Document{{bpm=88}}}}
You have received 30 heart-rate on your watch on jun/15/2016

Choose sensor: 
    0. Quit
    1. Heart Rate Number
    2. Running Activity
    3. Count Step On Date
Input integer:
2
Input month:jun
Input day:19
Input year:2016

Document{{_id=5da3f0a02309471f796c6f8d, sensor_name=activity, timestamp=Document{{start_time=sun jun 19 14:18:57 edt 2016, end_time=sun jun 19 14:20:00 edt 2016}}, sensor_data=Document{{activity=running, duration=62844}}}}

Yes, you ran from sun jun 19 14:18:57 edt 2016 to sun jun 19 14:20:00 edt 2016

Choose sensor: 
    0. Quit
    1. Heart Rate Number
    2. Running Activity
    3. Count Step On Date
Input integer:
3
How many steps did I walk on 
Input month:mar
Input day:22
Input year:2017

Document{{_id=5da3f0a52309471f796d39e4, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=24, step_delta=24}}}}
Document{{_id=5da3f0a52309471f796d39e5, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=41, step_delta=17}}}}
Document{{_id=5da3f0a52309471f796d39e6, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=82, step_delta=41}}}}
Document{{_id=5da3f0a52309471f796d39e7, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=99, step_delta=17}}}}
Document{{_id=5da3f0a52309471f796d39e8, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=140, step_delta=41}}}}
Document{{_id=5da3f0a52309471f796d39e9, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=268, step_delta=128}}}}
Document{{_id=5da3f0a52309471f796d39ea, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=320, step_delta=52}}}}
Document{{_id=5da3f0a52309471f796d39eb, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=350, step_delta=30}}}}
Document{{_id=5da3f0a52309471f796d39ec, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=370, step_delta=20}}}}
Document{{_id=5da3f0a52309471f796d39ed, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=395, step_delta=25}}}}
Document{{_id=5da3f0a52309471f796d39ee, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=413, step_delta=18}}}}
Document{{_id=5da3f0a52309471f796d39ef, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=516, step_delta=103}}}}
Document{{_id=5da3f0a52309471f796d39f0, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=520, step_delta=4}}}}
Document{{_id=5da3f0a52309471f796d39f1, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=577, step_delta=57}}}}
Document{{_id=5da3f0a52309471f796d39f2, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=597, step_delta=20}}}}
Document{{_id=5da3f0a52309471f796d39f3, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=599, step_delta=2}}}}
Document{{_id=5da3f0a52309471f796d39f4, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=719, step_delta=120}}}}
Document{{_id=5da3f0a52309471f796d39f5, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=778, step_delta=59}}}}
Document{{_id=5da3f0a52309471f796d39f6, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=816, step_delta=38}}}}
Document{{_id=5da3f0a52309471f796d39f7, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=828, step_delta=12}}}}
Document{{_id=5da3f0a52309471f796d39f8, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=832, step_delta=4}}}}
Document{{_id=5da3f0a52309471f796d39f9, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=849, step_delta=17}}}}
Document{{_id=5da3f0a52309471f796d39fa, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=864, step_delta=15}}}}
Document{{_id=5da3f0a52309471f796d39fb, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=877, step_delta=13}}}}
Document{{_id=5da3f0a52309471f796d39fc, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=902, step_delta=25}}}}
Document{{_id=5da3f0a52309471f796d39fd, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=963, step_delta=61}}}}
Document{{_id=5da3f0a52309471f796d39fe, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=991, step_delta=28}}}}
Document{{_id=5da3f0a52309471f796d39ff, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1058, step_delta=67}}}}
Document{{_id=5da3f0a52309471f796d3a00, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1071, step_delta=13}}}}
Document{{_id=5da3f0a52309471f796d3a01, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1098, step_delta=27}}}}
Document{{_id=5da3f0a52309471f796d3a02, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1110, step_delta=12}}}}
Document{{_id=5da3f0a52309471f796d3a03, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1128, step_delta=18}}}}
Document{{_id=5da3f0a52309471f796d3a04, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1146, step_delta=18}}}}
Document{{_id=5da3f0a52309471f796d3a05, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1161, step_delta=15}}}}
Document{{_id=5da3f0a52309471f796d3a06, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1182, step_delta=21}}}}
Document{{_id=5da3f0a52309471f796d3a07, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1209, step_delta=27}}}}
Document{{_id=5da3f0a52309471f796d3a08, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1258, step_delta=49}}}}
Document{{_id=5da3f0a52309471f796d3a09, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1288, step_delta=30}}}}
Document{{_id=5da3f0a52309471f796d3a0a, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1323, step_delta=35}}}}
Document{{_id=5da3f0a52309471f796d3a0b, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1349, step_delta=26}}}}
Document{{_id=5da3f0a52309471f796d3a0c, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1361, step_delta=12}}}}
Document{{_id=5da3f0a52309471f796d3a0d, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1366, step_delta=5}}}}
Document{{_id=5da3f0a52309471f796d3a0e, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1397, step_delta=31}}}}
Document{{_id=5da3f0a52309471f796d3a0f, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1417, step_delta=20}}}}
Document{{_id=5da3f0a52309471f796d3a10, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1438, step_delta=21}}}}
Document{{_id=5da3f0a52309471f796d3a11, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1462, step_delta=24}}}}
Document{{_id=5da3f0a52309471f796d3a12, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1476, step_delta=14}}}}
Document{{_id=5da3f0a52309471f796d3a13, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1499, step_delta=23}}}}
Document{{_id=5da3f0a62309471f796d3a14, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1512, step_delta=13}}}}
Document{{_id=5da3f0a62309471f796d3a15, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1536, step_delta=24}}}}
Document{{_id=5da3f0a62309471f796d3a16, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1562, step_delta=26}}}}
Document{{_id=5da3f0a62309471f796d3a17, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1583, step_delta=21}}}}
Document{{_id=5da3f0a62309471f796d3a18, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1602, step_delta=19}}}}
Document{{_id=5da3f0a62309471f796d3a19, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1614, step_delta=12}}}}
Document{{_id=5da3f0a62309471f796d3a1a, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1630, step_delta=16}}}}
Document{{_id=5da3f0a62309471f796d3a1b, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1656, step_delta=26}}}}
Document{{_id=5da3f0a62309471f796d3a1c, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1689, step_delta=33}}}}
Document{{_id=5da3f0a62309471f796d3a1d, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1702, step_delta=13}}}}
Document{{_id=5da3f0a62309471f796d3a1e, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1713, step_delta=11}}}}
Document{{_id=5da3f0a62309471f796d3a1f, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1734, step_delta=21}}}}
Document{{_id=5da3f0a62309471f796d3a20, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1738, step_delta=4}}}}
Document{{_id=5da3f0a62309471f796d3a21, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1751, step_delta=13}}}}
Document{{_id=5da3f0a62309471f796d3a22, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1764, step_delta=13}}}}
Document{{_id=5da3f0a62309471f796d3a23, sensor_name=activity, timestamp=wed mar 22 23:50:00 edt 2017, time_stamp=wed mar 22 23:50:00 edt 2017, sensor_data=Document{{step_counts=1778, step_delta=14}}}}
You walk 1778 steps

Choose sensor: 
    0. Quit
    1. Heart Rate Number
    2. Running Activity
    3. Count Step On Date
Input integer:
0

Process finished with exit code 0



