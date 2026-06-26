set serveroutput on;

declare
    v_number number := 7;
    v_result varchar2(20);
    v_category varchar2(20);
    v_sum number := 0;
    v_counter number := 1;
begin
    if mod(v_number, 2) = 0 then
        v_result := 'Even';
    else
        v_result := 'Odd';
    end if;

    dbms_output.put_line('IF-ELSE Result: ' || v_result);

    case
        when v_number between 1 and 5 then
            v_category := 'Low';
        when v_number between 6 and 10 then
            v_category := 'Medium';
        else
            v_category := 'High';
    end case;

    dbms_output.put_line('CASE Result: ' || v_category);

    for i in 1..5 loop
        v_sum := v_sum + i;
        dbms_output.put_line('FOR LOOP Iteration ' || i || ', Sum = ' || v_sum);
    end loop;

    while v_counter <= 5 loop
        dbms_output.put_line('WHILE LOOP Counter = ' || v_counter);
        v_counter := v_counter + 1;
    end loop;
end;
/
