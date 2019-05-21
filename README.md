Changing app locale from code in Android N and up is done with 'createConfigurationContext' and in the activity you
override 'attachBaseContext' method and provide the updated context

When using, 'com.google.android.material:material:1.1.0-alpha06' library this doesn't work anymore.
When you print 'resources.configuration.locale' you can see that it prints the phone locale and not the one you try to set.

Previous version of the library 'com.google.android.material:material:1.1.0-alpha05' works fine.