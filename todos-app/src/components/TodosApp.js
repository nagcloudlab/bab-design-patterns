import { useReducer, useState } from "react";
import TodoInput from "./TodoInput";
import TodoList from "./TodoList";

import { useSelector, useDispatch } from "react-redux"

// const todosReducer = (state, action) => {
//     switch (action.type) {
//         case "ADD_TODO":
//             return [...state, { id: state.length + 1, title: action.title, completed: false }]
//         case "COMPLETE_TODO":
//             return state.map(todo => {
//                 if (todo.id === action.id) {
//                     return { ...todo, completed: !todo.completed }
//                 }
//                 return todo
//             })
//         case "DELETE_TODO":
//             return state.filter(todo => todo.id !== action.id)
//         default:
//             return state
//     }
// }


function TodosApp() {

    // const [todos, setTodos] = useState([
    //     { id: 1, title: 'todo-1', completed: false },
    //     { id: 2, title: 'todo-2', completed: false },
    // ])

    // const [todos, dispatch] = useReducer(todosReducer, [])

    const todos = useSelector(state => state.todos)
    const dispatch = useDispatch()


    const completeTodo = (id) => {
        dispatch({ type: "COMPLETE_TODO", id })
    }
    const deleteTodo = (id) => {
        dispatch({ type: "DELETE_TODO", id })
    }
    const addTodo = (title) => {
        dispatch({ type: "ADD_TODO", title })
    }

    return (
        <div className="card">
            <div className="card-header">TodoApp</div>
            <div className="card-body">
                <TodoInput
                    onNewTodo={addTodo}
                />
                <TodoList todos={todos}
                    onComplete={completeTodo}
                    onDelete={deleteTodo}
                />
            </div>
        </div>
    )
}

export default TodosApp;