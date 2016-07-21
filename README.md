# BetterTextClockBackport
Backport Android 4.2 TextClock to Android 1.6+ with some codes of 12/24 format control.

### Screen record
- This is the gif of version 1.0.0, *NOT* the latest!  
  
![github](https://raw.githubusercontent.com/imknown/BetterTextClockBackport/master/Art/screen_record.gif "github")

### Sample code
``` xml
<net.imknown.bettertextclockbackportlibrary.TextClock
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:forceUse="format24"
    app:format24Hour="k:m:s"/>
```

For more info, plz see the sample: [xml layout][1] & [java code][2] .  
[1]: https://github.com/imknown/BetterTextClockBackport/blob/master/BetterTextClockBackportSample/src/main/res/layout/activity_main.xml
[2]: https://github.com/imknown/BetterTextClockBackport/blob/master/BetterTextClockBackportSample/src/main/java/net/imknown/bettertextclockbackport/MainActivity.java#L28-L36

# Install to project from jCenter
### Gradle dependency
``` groovy
compile 'net.imknown:BetterTextClockBackportLibrary:1.0.1'
 ```

### Maven dependency
 ``` xml
<dependency>
  <groupId>net.imknown</groupId>
  <artifactId>BetterTextClockBackportLibrary</artifactId>
  <version>1.0.1</version>
  <type>pom</type>
</dependency>
 ```

### Google AOSP code reference to:
https://android.googlesource.com/platform/frameworks/base/+/master/core/java/android/view/RemotableViewMethod.java
https://android.googlesource.com/platform/frameworks/base/+/master/core/java/android/widget/TextClock.java
https://android.googlesource.com/platform/frameworks/base/+/master/core/java/android/text/format/DateFormat.java

### Some Todo code reference to:
https://github.com/vojtech/android-textclock-backport

# License
    Copyright 2016 imknown
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
       http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
