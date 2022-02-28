# Welcome to P1 Intellijs' College Application Service  


## [Running site](https://intellijs.cf/)  

## Scrum Team Members and Contributions  


m221p1-intellijs   | [Scrum Board](https://github.com/yajatyadav/intellijs/projects/1) | [Repo Contributors](https://github.com/yajatyadav/intellijs/graphs/contributors) | ------ | ------ | ------ | ------ |
------ | ------ | ------ | ------ | ------ | ------ | ------ |
Name            | GitHub ID | Tasks | Scrum Board | Commits | Profile | Repl.it (FRQs) |
Kyle Myint | kylem314 | [Issues](https://github.com/yajatyadav/intellijs/labels/Kyle%20Myint) | [Scrum Board](https://github.com/yajatyadav/intellijs/projects/1?card_filter_query=assignee%3Akylem314) | [Commit Page](https://github.com/yajatyadav/intellijs/commits?author=kylem314)| [Profile](https://github.com/kylem314) | [Add Repl](https://replit.com/@KyleMyint/CSA-FRQs#Main.java)
Charlie Zhu | 1855387 | [Issues](https://github.com/yajatyadav/intellijs/labels/Charlie%20Zhu) | [Scrum Board](https://github.com/yajatyadav/intellijs/projects/1?card_filter_query=assignee%3A1855387) | [Commit Page](https://github.com/yajatyadav/intellijs/commits?author=1855387) | [Profile](https://github.com/1855387) | [Add Repl]() |
Yajat Yadav | yajatyadav | [Issues](https://github.com/yajatyadav/intellijs/labels/Yajat%20Yadav) | [Scrum Board](https://github.com/yajatyadav/intellijs/projects/1?card_filter_query=assignee%3Ayajatyadav) | [Commit Page](https://github.com/yajatyadav/intellijs/commits?author=yajatyadav) | [Profile](https://github.com/yajatyadav) | [Add Repl]() |
Eric Wang | elw55555 | [Issues](https://github.com/yajatyadav/intellijs/labels/Eric%20Wang) | [Scrum Board](https://github.com/yajatyadav/intellijs/projects/1?card_filter_query=assignee%3Aelw55555) | [Commit Page](https://github.com/yajatyadav/intellijs/commits?author=elw55555) | [Profile](https://github.com/elw55555) | [Add Repl]() |
Ak Prathipati | akprathipati | [Issues](https://github.com/yajatyadav/intellijs/labels/Akshit%20Prathipati) | [Scrum Board](https://github.com/yajatyadav/intellijs/projects/1?card_filter_query=assignee%3Aakprathipati) | [Commit Page](https://github.com/yajatyadav/intellijs/commits?author=akprathipati) | [Profile](https://github.com/akprathipati) | [Add Repl]() |  


## Wiki  
Our wiki offers in-depth documentation for various aspects of our project.
#### [Deployment](https://github.com/yajatyadav/intellijs/wiki/Deployment)
#### [Contributing Guidelines](https://github.com/yajatyadav/intellijs/wiki/Contributing-Guidelines)
#### [Project Theme + Technicals](https://github.com/yajatyadav/intellijs/wiki/Project-Theme---Technicals)  
<br/>

### Week 11 PBL Final

#### PBL theme consistent through project and described in Github Pages
Our PBL theme is a college application service for students, including features such as deadlines, due dates, and application fees. Our features include thge use a database of college application information to create features such as a calendar with deadlines, FAQ's with a search function, and a slideshow of colleges with additional information. In addition, students can log in and set colleges they're interested in applying to, opening a page with information specific to them and being able to opt to get notifications for upcoming deadlines.

![image](https://user-images.githubusercontent.com/55672662/156019614-9648d4db-f99e-4ada-8460-40500dabb2eb.png)

#### Sassy / Bootstrap illustration in GitHub pages
 - Sass partials are utilized within our project to organize the project below
![dwankawkldnalwdlkwandklawjdklajdlkwajdlajwldjalwd](https://user-images.githubusercontent.com/72889453/149645411-25d66017-4dd9-4fa5-8728-2f92cc38eac9.png)
 - Variable assignment are done below, so that the hexadecimal value of the colors don't need to be needlessly retyped:
``` scss
$light: #f7f7f7;
$dark: #222121;
$lime: #00cc66;
$orangeRed: #fb4b4e;
$blue: #2541b2;
```
* Example shown here:
``` scss
.navbar {
  background: $light; // see how instead of having to retype the hexadecimal, I can just reference it like this WOWOW so COOL
  height: 80px;
  display: flex;
  justify-content: space-between;
  padding: 0.5rem calc((100vw - 1200px) / 2);
  z-index: 10;
  position: relative;
```
- Nested styling is used within our project below in the hero section of the SCSS:
``` scss
.hero {
  background-color: $light; // see how the rest of the code is indented within .hero

  &__container {
    display: grid;
    grid-template-columns: 1fr 1fr;
    align-items: center;
    justify-items: center;
    margin: 0 auto;
    height: 90vh;
    z-index: 1;
    width: 100%;
    max-width: 1200px;
    padding-right: 24px;
    padding-left: 24px;

    @include tablet { // these will be explained next
      grid-template-columns: 1fr;
      height: 100%;
    }

    &--left {
      width: 100%;
      line-height: 1.2;

      @include tablet {
        padding: 5rem 0;
      }

      @include mobile {
        line-height: 1.5;
      }
    }

    &--left h1 {
      font-size: 4rem;
      color: $lime;

      @include mobile {
        font-size: 1.5rem;
      }
    }

    &--left h2 {
      font-size: 4rem;
      color: $dark;

      @include mobile {
        font-size: 2rem;
      }
    }

    &--left p {
      font-size: 2rem;
      color: $dark;
      margin-top: 1rem;
      font-weight: 700;

      @include mobile {
        font-size: 1.5rem;
      }
    }

    &--btn {
      font-size: 1rem;
      background-color: $lime;
      padding: 14px 32px;
      border: none;
      border-radius: 4px;
      color: $light;
      margin-top: 2rem;
      cursor: pointer;
      position: relative;
      transition: all 0.3s;
      outline: none;
    }

    &--btn a {
      position: relative;
      z-index: 2;
      color: $light;
      text-decoration: none;
    }

    &--btn:after { // code animates home page button so that it transitions to red when hovered
      position: absolute;
      content: '';
      top: 0;
      left: 0;
      width: 0;
      height: 100%;
      background: $orangeRed;
      transition: all 0.3s;
      border-radius: 4px;
    }

    &--btn:hover:after {
      width: 100%;
    }

    &--right {
      text-align: center;
    }

    &--img {
      height: 100%;
      width: 100%;
    }
  }
}
```
* You can see how this code works in tandem with the Hero section of the HTML, the class definitions are associated with every definition of styling coded above:
``` html
<!-- Hero Section -->
<div class="hero"> // each of the classes here correspond to what's defined above in the scss
    <div class="hero__container">
        <div class="hero__container--left">
            <h1>College Apps Are Coming!</h1>
            <h2>Be Prepared</h2>
            <p>Sign up now to join the list.</p>
            <button class="hero__container--btn"><a href="#">Sign Up</a></button>
        </div>
        <div class="hero__container--right">
            <img
                    src="images/img-2.svg"
                    class="hero__container--img"
            />
        </div>
    </div>
</div>
```

#### Database - CRUD operations on project centered database tables and describe in GitHub Pages

#### Deployed Project 24/7 - Deployment Overview and Policies described in GitHub Pages
![image](https://user-images.githubusercontent.com/72889343/156019173-4323bb30-3d15-4591-9bb7-d8f6ff86a439.png)
- These are the cmd steps that allow you to update and deploy your website using AWS
- Must first create a key on the AWS console 
- Can then use their example ssh when following these steps to simply update and deploy the website
- Main commands are sudo git pull to update and sudo mvn package to initalize/deploy 

#### Async Operation (ie JavaScript fetch) described in GitHub pages

<br/>
### Week 3 (12/13-12/17) About pages + Unit 3 FRQ  
[Review ticket](https://github.com/yajatyadav/intellijs/issues/10)  

Name | Link to code | Link to page |
--- | --- | --- |
Kyle Myint | [Link](https://github.com/yajatyadav/intellijs/blob/main/src/main/resources/templates/kyleabout) | [Link](http://intellijs.cf/kyleabout) |
Charlie Zhu | [Link](https://github.com/yajatyadav/intellijs/blob/main/src/main/resources/templates/charlieabout.html) | [Link](http://intellijs.cf/charlieabout) |
Yajat Yadav | [Link](https://github.com/yajatyadav/intellijs/blob/main/src/main/resources/templates/yajat_about.html) | [Link](http://intellijs.cf/yajat_about) |
Eric Wang | [Link](https://github.com/yajatyadav/intellijs/blob/main/src/main/resources/templates/ericabout.html) | [Link](http://intellijs.cf/ericabout) |
Ak Prathipati | [Link](https://github.com/yajatyadav/intellijs/commit/7b31523e7ee1fa9ae5863a146fcd0e0dbc52a04d) | [Link](http://intellijs.cf/akabout) |


