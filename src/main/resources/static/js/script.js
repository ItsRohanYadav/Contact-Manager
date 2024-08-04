console.log("Script Loaded");

let currentTheme = getTheme();

document.addEventListener('DOMContentLoaded', () =>{
    changeTheme()
})


function changeTheme()
{
    changePageTheme(currentTheme, currentTheme);

    const changeThemeButton=document.querySelector('#ThemeChangeButton');

    changeThemeButton.addEventListener("click", (event)=>{
        const oldTheme=currentTheme;
        console.log("change theme button clicked");
        
        if (currentTheme=="dark"){
            currentTheme="light";
        }
        else if(currentTheme=="light"){
            currentTheme="dark";
        }
        console.log(currentTheme);
        changePageTheme(currentTheme,oldTheme);

        setTheme(currentTheme);
        document.querySelector('html').classList.remove(oldTheme)
        document.querySelector('html').classList.add(currentTheme)

    }); 
}


function setTheme(theme)
{
    localStorage.setItem("theme", theme);

}

function getTheme()
{
    let theme=localStorage.getItem("theme");
    return theme ? theme : "light";
}

function changePageTheme(theme, oldTheme)
{
    setTheme(currentTheme);
        document.querySelector('html').classList.remove(oldTheme)
        document.querySelector('html').classList.add(currentTheme)
}
