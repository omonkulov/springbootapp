<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>BootStrapIsNotWorking</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>

<body>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/custom/deleteall.js"></script>
    <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
    <section class="jumbotron text-center">
        <div class="container">
            <h1 class="jumbotron-heading">Album example</h1>
            <p class="lead text-muted">Something short and leading about the collection below—its contents, the creator, etc. Make it short and sweet, but not too short so folks don't simply skip over it entirely.</p>
            <p>
                <a id="deleteAll" class="btn btn-danger my-2">Delete All</a>
            </p>
        </div>
    </section>
    <div class="container p-3 ">
        <form action="" method="post">
            <div class="form-group">
                <label for="firstNameInput">First Name:</label>
                <input class="form-control" type="text" name="firstName" id="firstNameInput" placeholder="Ex: John" maxlength="15" required>
            </div>
            <div class="form-group">
                <label for="lastNameInput">Last Name</label>
                <input class="form-control" type="text" name="lastName" id="lastNameInput" placeholder="Ex: Doe" maxlength="15" required>
            </div>

            <div class="custom-control custom-switch py-3">
                <input type="checkbox" class="custom-control-input" id="switch1" name="checkedIn" >
                <label class="custom-control-label" for="switch1">I agree that today's date is ${.now?string('MM/dd/YYYY')}</label>
            </div>

            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
    <div class="table-responsive-lg p-3">
        <table class="table" id="user_table">
            <thead>
                <tr>
                    <th scope="col"><div class="custom-control custom-checkbox">
                            <input type="checkbox" class="custom-control-input" id="selectAll" name="selectAll">
                            <label class="custom-control-label" for="selectAll">Select</label>
                        </div></th>
                    <th scope="col">First Name</th>
                    <th scope="col">Last Name</th>
                    <th scope="col">Agreed</th>
                    <th scope="col">Date</th>
            </thead>
            <#list allUsers as user>
                <tr>
                    <td>
                        <div class="custom-control custom-checkbox">
                            <input type="checkbox" class="custom-control-input" id=${user.id} name=${user.id}>
                            <label class="custom-control-label" for=${user.id}>${user.id}</label>
                        </div>
                    </td>
                    <td>${user.firstName}</td>
                    <td>${user.lastName}</td>
                    <td><#if user.checkedIn>Yes<#else>No</#if></td>
                    <td><#if user.date??>${user.date}<#else>Not Recorded</#if></td>
                </tr>
            </#list>
        </table>
    </div>
</body>

</html>