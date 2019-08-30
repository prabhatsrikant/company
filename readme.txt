Have use Cloud MongoDB as database.

Get APIs
http://localhost:8080/employee/getAll 	--> to fetch all the employee info.
http://localhost:8080/employee/{id}	--> to fetch employee info with employeeid
	eg: http://localhost:8080/employee/103

Post APIs
http://localhost:8080/employee/save	--> Save employee data.
http://localhost:8080/employee/update	--> update employee data.

JSON
{
    "employeeId": "103",
    "name": "JOHN",
    "officeInfo": {
        "designation": "Manager",
        "managerId": "001",
        "department": "SALES",
        "dateOfJoining": "12-12-2012",
        "salary": "70000"
    },
    "addressInfo": [
        {
            "houseNo": "123",
            "street1": "ABC Street",
            "street2": "ABC Location",
            "city": "Delhi",
            "state": "Delhi",
            "zip": "110011",
            "currentORpermanent": false
        }
    ],
    "contactInfo": [
        {
            "name": "JENNY",
            "contactNo": "9889898998",
            "relationship": "Sister"
        }
    ],
    "personalInfo": {
        "gender": "Male",
        "maritalStatus": "Married",
        "dob": "01-01-1990",
        "spouseName": "JENNIFER",
        "fatherName": "JACK",
        "mobileNo": "97907980980",
        "email": "JOHN@HOTMAIL.COM"
    },
    "bankInfo": {
        "accountNo": "1233211233211",
        "bankName": "CITI"
    }
}

Have tried to keep the model simple.
It could have more relevent information as previous employer, insurance, tax components.


