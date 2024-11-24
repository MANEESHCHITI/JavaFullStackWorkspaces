import React from 'react'
const ListComponent = () => {
    const dummydata = [
        {
            "id": "1",
            "firstname": "Srikanth",
            "lastname": "C",
            "email": "srkntjva@gmail.com"
        },
        {
            "id": "2",
            "firstname": "Venkat",
            "lastname": "C",
            "email": "Venkat@gmail.com"
        },
        {
            "id": "3",
            "firstname": "Nag",
            "lastname": "C",
            "email": "Nag@gmail.com"
        }
    ]
    return (
        <div className='container'>
            ListComponent
            <h1>List of employees </h1>
            <table className='table table-striped table-bordered'>
                <thead>
                    <tr>
                        <th>Employee ID</th>
                        <th>Employee First Name</th>
                        <th>Employee Last Name</th>
                        <th>Employee Email</th>
                    </tr>
                    <tr>
                    </tr>
                </thead>
                <tbody>
                    {
                        dummydata.map(s =>
                            <tr key={s.id}>
                                <td>{s.id}</td>
                                <td>{s.firstname}</td>
                                <td>{s.lastname}</td>
                                <td>{s.email}</td>
                            </tr>
                        )
                    }
                </tbody>
            </table>
        </div>
    )
}
export default ListComponent;
