import { Container } from '@material-ui/core';
import { Typography } from '@material-ui/core';
import './App.css';
import TodoApp from './components/todoList/todoApp';

function App() {
  return (
    <Container maxWidth='xl'>
      <Typography align='center' variant="h2"> Todo - List</Typography>
      <TodoApp/>
    </Container>
  );
}

export default App;