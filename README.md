# AppShowArticles
I use kotlin to create app,The app able to display a list articles with infinity Recyclerview, load 10 articles every time,test with 10000 hold dummy data.
Each Item have name ,content and 2 two picture.

# Development setup
First off, you require the latest Android Studio 3.0 (or newer) to be able to build the app.

# Installation
Right now I don't publish my app in the app store.So just clone repository and open it in Android Studio.For there,you can easily load a build of the app into your android device.

Use git:
git clone https://github.com/nguyenbahung94/AppShowArticles.git

# Building
The build requires the Android SDK and jdk to be installed in your development environment.
Open the android studio then click File->Open (select folder clone project and open).

# Solutions 
I have been created file json contain 10000 object and save file in folder assets.
When the run app the first time I will read objects from file json and save it in big list.
I have been created a current list to save objects to work with adapter.
At the first time I will automatic add 10 items into current list.
When the user scroll the recyclerview I will check If position is the end of list I will call method to add more 10 items from big list to current list.
Each time add 10 items I will check
         If (the current list size + 10 <= big list size)
            I will add 10 items from position is (size of current list) until (size of current list +10)
         else 
            I will add 10 items from position is (size of current list) until (size of big list)
             
If the current list size < big list size the method add more 10 items will working but If not the method will not working.

