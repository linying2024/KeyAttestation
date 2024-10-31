import os
import sys

def replace_string_in_file(file_path, old_string, new_string):
    try:
        with open(file_path, 'r', encoding='utf-8') as file:
            file_data = file.read()

        if old_string in file_data:
            new_data = file_data.replace(old_string, new_string)
            with open(file_path, 'w', encoding='utf-8') as file:
                file.write(new_data)
        print(f"Processed {file_path}")
    except Exception as e:
        print(f"Error processing {file_path}: {e}")

def replace_string_in_directory(directory, old_string, new_string):
    for root, dirs, files in os.walk(directory):
        for file in files:
            file_path = os.path.join(root, file)
            replace_string_in_file(file_path, old_string, new_string)

def parse_args(args):
    path = "."
    old_string = "io.github.vvb2060.keyattestation.local"
    new_string = "io.github.vvb2060.keyattestation.local.local"

    it = iter(args)
    for arg in it:
        if arg == '-path':
            path = next(it)
        elif arg == '-oldstring':
            old_string = next(it)
        elif arg == '-newstring':
            new_string = next(it)

    return path, old_string, new_string

if __name__ == "__main__":
    # Parse the command line arguments
    _, *args = sys.argv
    directory, old_string, new_string = parse_args(args)

    print(f"Replacing '{old_string}' with '{new_string}' in files in directory: {directory}")
    replace_string_in_directory(directory, old_string, new_string)
    print("Replacement completed.")