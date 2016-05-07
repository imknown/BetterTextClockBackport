# BetterTextClockBackport
Backport Android 4.2 TextClock to Android 1.6+ with some codes of 12/24 format control.

### Screen record
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

See sample for more info.

# Install to project from jCenter
### Gradle dependency
``` groovy
`compile 'net.imknown:BetterTextClockBackportLibrary:1.0.1'`
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
