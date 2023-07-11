

function TodoInput({ onNewTodo }) {

    const handleKeyUp = (e) => {
        if (e.keyCode === 13) {
            const title = e.target.value;
            e.target.value = '';
            onNewTodo(title);
        }
    }

    return (
        <div className="card">
            <input type="text"
                className="form-control"
                placeholder="What needs to be done?"
                onKeyUp={handleKeyUp}
            />
        </div>
    )
}

export default TodoInput;