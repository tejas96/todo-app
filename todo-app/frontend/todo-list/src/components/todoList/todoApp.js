import {useState, useEffect} from 'react';
import { Container,TextField, Button,Grid,Grow,Typography } from '@material-ui/core';


const TodoApp = (props)=>{

    const BASE_URL = 'http://localhost:8080';
    
    const [formData, setFormData] = useState({
        task : '',
        project : '',
        priority : '',
    });

    const [todo, setTodo] = useState([]);
    
    const handleOnchange = (event)=>{
        const value = event.target.value;
        const prop = event.target.name;
        console.log(value, prop);

        setFormData((prevState)=>{
            return {
                ...formData,
                [prop] : [value],
            }
        })
    }

    useEffect(()=>{
        fetch(`${BASE_URL}/api/v1/alltask`)
        .then(res=>res.json())
        .then(result=>{
            setTodo(result)
        })
    },[]);

    return (
        <Container style={{textAlign:'center'}} maxWidth='xl'>
             <Container  maxWidth='xl'>
                <TextField onChange={handleOnchange} id="outlined-basic" label="Task" variant="outlined" name='task'/>
                <TextField onChange={handleOnchange} id="outlined-basic" label="Project" variant="outlined" name='project'/>
                <TextField onChange={handleOnchange} id="outlined-basic" label="Priority" variant="outlined" name='priority'/>
                <Button size='large' variant="contained" color="primary">
                 Primary
                </Button>
             </Container>
            
             <Grow in>
                <Container style={{marginTop:'50px'}}>
                    <Grid container justify='space-between' alignItems='stretch' spacing={3}>

                        <Grid style={{borderRight:'1px solid grey'}}  item xs={12} sm={4}>
                            <Typography align='center' variant="h4">ToDo</Typography>
                            {todo.map(item=>{
                                return(
                                <div>
                                    <div>
                                        <span>{item.task}</span>
                                    </div>
                                    <div>
                                        {item.status}
                                    </div>
                                </div>
                                )
                            })}
                        </Grid>
                        <Grid style={{borderRight:'1px solid grey'}}  item xs={12} sm={4}>
                            <Typography align='center' variant="h4">In-Progress</Typography>
                        </Grid>
                        <Grid style={{borderRight:'1px solid grey'}}  item xs={12} sm={4}>
                         <Typography align='center' variant="h4">Done</Typography>

                        </Grid>
                    </Grid> 
                </Container>
            </Grow>
            
        </Container>
    )
}

export default TodoApp;