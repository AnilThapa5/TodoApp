# TodoApp

#Table Of Content # <br/>
-General Info<br/>
-Introdction<br/>
-Architicture<br/>
-Features<br/>
-Getting Started<br/>


# General Info

This ToDo app is to keep the record of dayto day activities as their piority. This actvity can inform to user to do the task.Assign the task for to keep remember.
 
# Introduction

This app helps to remind the activity and task need to perform as per their piority. 
This app helps to get activity to done and keep record for users.
To developed this app MVVM design pattern and recycle view hepls to listing the tasks.
Fragment has been used in this app and for the databses SqlLite has been used to kept the data stored which pre installed in Android Studio. 
There is calander that can be view as user need. 
When the task in completed the pupup toast show the message. To delete the task need to swipe left or right to delete task and
Click to edit the task.

 
# Architecture
##<b>Android Architecture components</b><br/> 
Architicture are android operating system of software components that divites into different level.
This divided architictures are Libraries, Android runtime, applicatin framewrk, linux kernel and applicatin itself.
In this project MVVM pattern is used to developed the app and pattern describe below

 1. <b><u>Model</u></b> represent the logic of business either local or remote.
 2. <b><u>View</u></b> consist of UI (User Interface) and response back with the help of ViewModel when action send. The UI represent(Activity, Fagment and XML).
 3. <b><u>ViewModel</u></b> This consist as the bridge between Model and View. When view send responses then entract with the Model and then ViewModel intrect with them to get data. 
   
<img src="/Image/MVVM.png" alt="image" width="600" height="600"/>
 
This model and project consist of DAO, Task Database, Task Model. This class generally related with model and that interact with Model and ModelView calss. This class ModelView generally interacts with Model and View inorder to communicated with each other and perform task.

 
## Features
- Create, Update and Delete (CRUD operation)
- Access of calender 
- Funcationality like swipe to delete added tasks
- Click to Edit and update task
- Used of database to store the data
- Share feature that can be share with others


# Getting Started

This app with its runtime screens are shown as how it looks and performs are shown below: 

<img src="/Image/Capture.PNG" alt="image" width="200"/>        <img src="/Image/Capture2.PNG" alt="image" width="200"/>

The first picture show the dashboard that shows all the task. The floating add button gives the second screen shown for adding task. 

<img src="/Image/Capture3.PNG" alt="image" width="200"/>       <img src="/Image/Capture4.PNG" alt="image" width="200"/>

When Plus sign clicked it will redirect to page to add task and when task added the added task shown in dashboard.

<img src="/Image/Capture5.PNG" alt="image" width="200"/>       <img src="/Image/Capture6.PNG" alt="image" width="200"/>

This form is clicking in the field of any task it will goes to edit the previous task and task has been updates can be seen in above figure.

<img src="/Image/Capture7.PNG" alt="image" width="200"/>       <img src="/Image/Capture8.PNG" alt="image" width="200"/>

This is page where task can be added and clicking the button called View Calender will redirect to calender section.

<img src="/Image/Capture9.PNG" alt="image" width="200"/>  

This is the calender page where calender can be seen and pack to add task button to go  back.

<img src="/Image/Capture10.PNG" alt="image" width="200"/>      <img src="/Image/Capture11.PNG" alt="image" width="200"/>  
This share button allows to share the task on different platform. After clicking it will appear the share items available 


<img src="/Image/Capture12.PNG" alt="image" width="200"/>
This is the share format through messages where the user task can be shares via a message.

<img src="/Image/Capture13.PNG" alt="image" width="200"/>      <img src="/Image/Capture14.PNG" alt="image" width="200"/> 

In order to delete the task user need to click on top of three dots or directly swipe left or right to delete the task.

<img src="/Image/Capture15.PNG" alt="image" width="200"/>
Rotating the phone to see does it perform on landscape modes.

## License
Copyright 2021 Anil, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
