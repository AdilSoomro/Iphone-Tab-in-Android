Android tabs at bottom!
===================


This repository contains sample of setting android  `TabLayout` at bottom and showing `Fragment` embedded in `ViewPager`. The magic happens very simply. You need to arrange them properly to stick tabs at bottom.

    <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:id="@+id/main_content"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:fitsSystemWindows="true">
        <android.support.design.widget.TabLayout
            android:id="@+id/tab_layout"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_alignParentBottom="true"
            android:background="@drawable/tab_background"/>
        <android.support.v4.view.ViewPager
            android:id="@+id/main_tab_content"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_alignParentTop="true"
            android:layout_above="@id/tab_layout"
            android:background="@android:color/white" />
    </RelativeLayout>

Screenshot
----------


![nexus 5 sample here](https://raw.githubusercontent.com/AdilSoomro/Iphone-Tab-in-Android/master/screenshot.png)



Licence
----------
he MIT License (MIT)

Copyright (c) 2014 Adil Soomro

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

Happy Coding!
----------
