
import { createStore, combineReducers } from 'redux'

const todosReducer = (state = [], action) => {
    switch (action.type) {
        case "ADD_TODO":
            return [...state, { id: state.length + 1, title: action.title, completed: false }]
        case "COMPLETE_TODO":
            return state.map(todo => {
                if (todo.id === action.id) {
                    return { ...todo, completed: !todo.completed }
                }
                return todo
            })
        case "DELETE_TODO":
            return state.filter(todo => todo.id !== action.id)
        default:
            return state
    }
}

const rootReducer = combineReducers({
    todos: todosReducer
});

const store = createStore(rootReducer, { todos: [] }, window.__REDUX_DEVTOOLS_EXTENSION__ && window.__REDUX_DEVTOOLS_EXTENSION__())

export default store

