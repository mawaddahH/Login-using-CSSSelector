# Login-using-CSSSelector
Assignment 3 W9D3 - SDA - Software QA Bootcamp

## Table of contents
* [Question](#question)
* [Answer](#answer)
* [Output Screenshots](#output-screenshots)

---
## Question
Navigate to Facebook, enter the userId and password using the CSSSelector method and log in.  
- STEP 1: Go to Facebook.com
- STEP 2: Right-click on the email field and click on inspect
- STEP 3: With the help of inspecting, locate the web element using CSSSelector with method and value
- STEP 4: Same way, complete the full flow of the login on facebook.com


## Answer

I used a ["Facebook"](https://www.facebook.com/)
And Before running the code, there are some steps that need to take considered:


### First:
Setup Latest Web Driver for Chrome  Driver.
Donwload the necessary jar files:
- Selenium (Lastest).
- TestNG (Lastest).
- commander (Lastest).

### Second:
Add them as a library in the classpath of the project
- _click-reight on the file project >Build path > configure Bild path > Java Build Path > Libraries > classpath > add external JARs > Apply and close_.

### Third:
I opened the website, then take web elements, and then add them to the code I use cssSelector with tag, id, and attribute as syntax:
`tag#id[attribute=value]`.
And cssSelector with tag and attribute as syntax: `tag[attribute=value]` .

The cssSelector I wrote it are:
- Username TextField
```md
input#email[name='email']
```
- Password TextField
```md
input#pass[name='pass']
```
- Login Button
```md
button[name='login']
```


<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182497037-314ce1c3-a6b2-44b4-a3d2-c8184550c2d7.png" width=60% height=60%>
</p>

---
## Output Screenshots:

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182498824-d9928cef-b525-4d48-857a-1d3110f59ce2.png" width=80% height=80%>


https://user-images.githubusercontent.com/48597284/182498848-310126df-c972-476c-b611-9f56274ee7ac.mp4
</p>
