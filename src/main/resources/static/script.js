document.write("Update and Delete the HomePage");

const delPosts = document.getElementById('delPosts')

$(delAccount).click(() => {
    if (confirm("Are you sure that you want to DELETE account?")) {
        alert("Account Deleted Successfully")
        return true;
    } else {
        alert("Phew, that was close!")
        return false;
    }
})

