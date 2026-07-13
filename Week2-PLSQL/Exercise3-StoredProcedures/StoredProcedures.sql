set serveroutput on;

begin
    execute immediate 'drop table employee_details purge';
exception
    when others then
        if sqlcode != -942 then
            raise;
        end if;
end;
/

create table employee_details (
    emp_id number primary key,
    emp_name varchar2(50) not null,
    department varchar2(50) not null,
    salary number(10,2) not null
);
/

insert into employee_details values (101, 'Asha', 'IT', 45000);
insert into employee_details values (102, 'Rahul', 'HR', 38000);
insert into employee_details values (103, 'Meera', 'Finance', 52000);
commit;
/

create or replace procedure display_employee_details (
    p_emp_id in number
) as
    v_emp_name employee_details.emp_name%type;
    v_department employee_details.department%type;
    v_salary employee_details.salary%type;
begin
    select emp_name, department, salary
    into v_emp_name, v_department, v_salary
    from employee_details
    where emp_id = p_emp_id;

    dbms_output.put_line('Employee ID: ' || p_emp_id);
    dbms_output.put_line('Employee Name: ' || v_emp_name);
    dbms_output.put_line('Department: ' || v_department);
    dbms_output.put_line('Salary: ' || v_salary);
exception
    when no_data_found then
        dbms_output.put_line('Employee not found for ID ' || p_emp_id);
end;
/

begin
    display_employee_details(101);
    display_employee_details(103);
end;
/
